package com.jake.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/jake/controller/CsvController;", "", "csvServiceImpl", "Lcom/jake/service/serviceimpl/CsvServiceImpl;", "(Lcom/jake/service/serviceimpl/CsvServiceImpl;)V", "generateFileCSV", "Lio/micronaut/http/HttpResponse;", "name", "", "client", "", "Lcom/jake/model/Client;", "csv-executor"})
@io.micronaut.http.annotation.Controller(value = "/csv-file")
public final class CsvController {
    private final com.jake.service.serviceimpl.CsvServiceImpl csvServiceImpl = null;
    
    public CsvController(@org.jetbrains.annotations.NotNull
    com.jake.service.serviceimpl.CsvServiceImpl csvServiceImpl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post(value = "{name}")
    public final io.micronaut.http.HttpResponse<java.lang.Object> generateFileCSV(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.lang.String name, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    java.util.List<com.jake.model.Client> client) {
        return null;
    }
}