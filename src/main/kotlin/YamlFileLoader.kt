package hackl.projekt

import java.io.File

class YamlFileLoader {

    fun getFileAsString(fileName: String) = File(fileName).readText()

}