package com.synchronoss.IAPServer.common.models.controller;

import io.swagger.v3.core.util.Json;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/translation")
public class TranslationController {

    @PostMapping("/sampleReceipt")
    public ResponseEntity<JSONObject> sampleReceiptValidator(@RequestBody JSONObject jsonObject){
        log.info(Json.pretty(jsonObject));
        return ResponseEntity.ok(jsonObject);
    }
}
