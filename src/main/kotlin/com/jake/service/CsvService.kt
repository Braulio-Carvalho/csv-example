package com.jake.service

import com.jake.model.Client

interface CsvService {

    fun generateFileCSV(nameFile: String, clientList: List<Client>)
}