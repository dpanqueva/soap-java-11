package com.telefonica.soap.java.once.model.service;


import com.telefonica.soap.java.once.model.client.dto.AltaPrepago;
import com.telefonica.soap.java.once.model.client.ws.AltaPrepagoConsume;
import com.telefonica.soap.java.once.model.dto.TblRequiredDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AltaPrepagoServiceImpl implements IAltaPrepagoService {

    @Autowired
    private AltaPrepagoConsume columbiaEShopService;

    @Override
    public TblRequiredDTO altaPrepagoConsume(AltaPrepago request) {
        columbiaEShopService.altaPrepagoFSWSService(request);

        return null;
    }
}
