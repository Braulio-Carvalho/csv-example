package com.jake.service;

import com.jake.model.Client
import com.jake.utils.UtilCSV.Companion.CSV_File_Path
import jakarta.inject.Singleton
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.nio.file.Files
import java.nio.file.Paths

@Singleton
class CsvService {

    fun generateFileCSV(nameFile: String, clientList: List<Client>) {
        val writer = Files.newBufferedWriter(Paths.get(CSV_File_Path(nameFile)))
        val csvPrinter = CSVPrinter(writer, CSVFormat.DEFAULT)

        for (client in clientList) {
            csvPrinter.printRecord(
                client.cpf, client.firstName, client.lastName, client.transactionAmount.toString()
            )
        }
        csvPrinter.flush()
        csvPrinter.close()
    }
}
