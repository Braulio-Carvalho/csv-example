package com.jake.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/jake/service/CsvService;", "", "generateFileCSV", "", "nameFile", "", "clientList", "", "Lcom/jake/model/Client;", "csv-executor"})
public abstract interface CsvService {
    
    public abstract void generateFileCSV(@org.jetbrains.annotations.NotNull
    java.lang.String nameFile, @org.jetbrains.annotations.NotNull
    java.util.List<com.jake.model.Client> clientList);
}