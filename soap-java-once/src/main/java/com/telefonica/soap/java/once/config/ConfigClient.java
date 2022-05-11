package com.telefonica.soap.java.once.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class ConfigClient {


    @Autowired
    private Environment env;

    @Value("${url.consume}")
    private String consumeUrl;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.telefonica.soap.java.once.model.client.dto");
        //String[] packagesToScan= {"com.everis.telefonica.msbonusquerysystem.model.soap.boltons.management"};
        //marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }

    @Bean(name = "bonusDetails")
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri(consumeUrl);
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        webServiceTemplate.setMessageSender(messageSender());
        return webServiceTemplate;
    }

    private WebServiceMessageSender messageSender() {
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setReadTimeout(Integer.parseInt(env.getProperty("client.timeout.connection")));
        messageSender.setConnectionTimeout(Integer.parseInt(env.getProperty("client.timeout.read")));
        return messageSender;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
