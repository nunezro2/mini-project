package hackl.projekt

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import java.io.File

fun main() {
    println("Hello World!")
}

class Main  {

    private val mapper = YAMLFactory()

    fun loadFile() {
        val fileName = "/Users/claudia.nunez/Projects/acrolinx_interview/src/main/resources/ci.yml"
        val content = getFileAsString(fileName)

        val parser = getParser(content)
    }

    fun getFileAsString(fileName: String) = File(fileName).readText()

    fun getParser(content: String) = mapper.createParser(content)
}

