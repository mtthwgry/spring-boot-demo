package com.outcomehealth.springbootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/devices")
public class DevicesController {

    @GetMapping
    String index() {
        return "Hello world!";
    }

    @GetMapping("/{deviceId}")
    String show(@PathVariable String deviceId) {
        return "Fetching " + deviceId + " " + UUID.randomUUID().toString();
    }
}
