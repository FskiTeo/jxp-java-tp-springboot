package com.jxpjava.demo.services;


import com.jxpjava.demo.services.httpclient.PostClient;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@Service
@AllArgsConstructor
public class ArenaService {

    private final PostClient postClient;

    @PostConstruct
    public void register() {
        String baseUrl = "http://localhost:8080"; // à remplacer par l'URL de votre application
        String studentName = "Téo F";

        try {
            String response = postClient.register(Map.of("baseUrl", baseUrl, "studentName", studentName));
            log.atInfo().log("response: " + response);
        } catch (Exception e) {
            log.atError().log("error: " + e.getMessage());
        }
    }
}

