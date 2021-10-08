package com.jake.utils


class UtilCSV {

    companion object {
//         val CSV_File_Path = "/home/brauliocarvalho/repo-cursos/csv-example/filesCSV/$nameFile.csv"
//       val reader: BufferedReader = Files.newBufferedReader(Paths.get(UtilCSV.CSV_READ_PATH))

        fun CSV_File_Path(nameFile: String): String {
            return "/home/brauliocarvalho/repo-cursos/csv-example/filesCSV/$nameFile.csv"
        }
    }


}

