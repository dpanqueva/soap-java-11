package com.telefonica.soap.java.once.model.service;


import com.telefonica.soap.java.once.model.client.dto.AltaPrepago;
import com.telefonica.soap.java.once.model.dto.TblRequiredDTO;

public interface IAltaPrepagoService {

    public TblRequiredDTO altaPrepagoConsume(AltaPrepago request);
}
