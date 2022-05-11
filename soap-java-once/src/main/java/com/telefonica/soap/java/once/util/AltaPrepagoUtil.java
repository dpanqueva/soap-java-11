package com.telefonica.soap.java.once.util;


import com.telefonica.soap.java.once.model.client.dto.AltaPrepago;
import com.telefonica.soap.java.once.model.client.dto.ApfRequest;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class AltaPrepagoUtil {


    public AltaPrepago buildRequest(ApfRequest request) {
        AltaPrepago altaPrepago = new AltaPrepago();
        request.setNomUsuaOra("Diego");
        request.setNomCliente("Alejandro");
        request.setApe1Cliente("as");
        request.setCodTipIdentCliente("A12");
        request.setNumIdentCliente("1013616358");
        String FORMATER = "yyyy-MM-dd'T'HH:mm:ss";

        DateFormat format = new SimpleDateFormat(FORMATER);
        Date date = new Date();
        try {
            XMLGregorianCalendar gDateFormatted1 =
                    DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
            request.setFecNacimiento(gDateFormatted1);
            request.setFecAltaCliente(gDateFormatted1);
            request.setFecVentanaCambio(gDateFormatted1);
            request.setFecAltaAbonado(gDateFormatted1);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        request.setIndSexo("F");
        request.setCodEstadoCivil("UL");
        request.setIndTipPersona("CC");
        request.setTelefono1("323");
        request.setCodRegion("CO");
        request.setCodProvincia("1");
        request.setCodCiudad("1");
        request.setCodComuna("0");
        request.setNomCalle("TRECE");
        request.setTipCalle("A1");
        request.setCodArticuloImei("123AS321SD5");
        request.setNumSerieImei("ASD23F135S");
        request.setNumSerieIcc("WQER2");
        request.setCodEstrato("2");
        long n = new Long("3232910911");
        request.setNumCelular(n);
        altaPrepago.setApfRequest(request);
        return altaPrepago;
    }
}
