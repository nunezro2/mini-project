package hackl.projekt

import hackl.projekt.YamlContentParser
import hackl.projekt.YamlFileLoader

class Main {
    fun main() {

        val fileName = "./src/main/resources/ci.yml"
        val fileLoader = YamlFileLoader()
        val contentParser = YamlContentParser()

        val content = fileLoader.getFileAsString(fileName)
        println(content.substring(0, 10))


        val parser = contentParser.getParser(content)
    }
}
