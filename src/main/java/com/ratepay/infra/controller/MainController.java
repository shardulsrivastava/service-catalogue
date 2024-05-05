package com.ratepay.infra.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.ratepay.infra.model.ServiceCatalogue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ServiceCatalogue list(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ServiceCatalogue(String.valueOf(counter.incrementAndGet()), String.format(template, name));
    }

    @GetMapping("/v1")
    public String v1() {
        return "You are at the version v1";
    }

    @GetMapping("/v2")
    public String v2() {
        return "You are at the version v2";
    }
}