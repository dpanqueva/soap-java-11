package com.telefonica.soap.java.once.controller;


import com.telefonica.soap.java.once.model.client.dto.AltaPrepago;
import com.telefonica.soap.java.once.model.client.dto.ApfRequest;
import com.telefonica.soap.java.once.model.service.IAltaPrepagoService;
import com.telefonica.soap.java.once.util.AltaPrepagoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AltaPrepagoController {

    @Autowired
    private IAltaPrepagoService altaPrepagoService;

    @Autowired
    private AltaPrepagoUtil altaPrepagoUtil;


    @GetMapping("/alta-prepago/{nomService}")
    public ResponseEntity<?> consumirSoap(String nomService) {
        Map<String, Object> response = new HashMap<>();

        AltaPrepago request = altaPrepagoUtil.buildRequest(new ApfRequest());
        response.put("RSPoint", altaPrepagoService.altaPrepagoConsume(request));

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
