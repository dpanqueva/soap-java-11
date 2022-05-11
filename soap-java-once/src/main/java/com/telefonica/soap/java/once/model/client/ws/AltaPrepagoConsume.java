package com.telefonica.soap.java.once.model.client.ws;

import com.telefonica.soap.java.once.model.client.dto.AltaPrepago;
import com.telefonica.soap.java.once.model.client.dto.AltaPrepagoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

@Slf4j
@Component
public class AltaPrepagoConsume {
    @Autowired
    @Qualifier("bonusDetails")
    private WebServiceTemplate wsAccountAltamira;

    public AltaPrepagoResponse altaPrepagoFSWSService(AltaPrepago request) {
        log.info("Consumo a altaPrepago");
        AltaPrepagoResponse rs1 = null;
        try {
            Object ro = wsAccountAltamira.marshalSendAndReceive(request,
                    new WebServiceMessageCallback() {

                        public void doWithMessage(WebServiceMessage message) {
                            log.info("contando");
                            ((SoapMessage) message).setSoapAction("altaPrepago");

                        }
                    });
            JAXBContext jaxbContext = JAXBContext.newInstance(AltaPrepagoResponse.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(ro, sw);
            /** xml format*/
            String xmlString = sw.toString();

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            rs1 = (AltaPrepagoResponse) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
        } catch (Exception e) {
            log.error("Error consumiendo altamira" + e.getMessage());
            //throw new ServiceResponseException("Error consumiendo altamira" + e.getMessage());
        }

        return rs1;
    }
}
