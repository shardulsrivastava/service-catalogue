package com.ratepay.infra.model;

public class ServiceCatalogue {


    private final String id;
    private final String content;

    public ServiceCatalogue(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }
}
