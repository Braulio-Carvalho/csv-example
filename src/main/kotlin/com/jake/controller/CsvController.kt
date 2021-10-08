package com.jake.controller

import com.jake.model.Client
import com.jake.service.CsvService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable

import io.micronaut.http.annotation.Post


@Controller("/csv-file")
class CsvController(private val csvService: CsvService) {

    @Post("{name}")
    fun generateFileCSV(@PathVariable name: String, @Body client: List<Client>): HttpResponse<Any> {
        return HttpResponse.created(csvService.generateFileCSV(name, client))
    }

}