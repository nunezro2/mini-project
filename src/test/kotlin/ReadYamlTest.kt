import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import org.junit.jupiter.api.Test
import java.io.File
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull


class ReadYamlTest {

    private val mapper = YAMLFactory()

    @Test
    fun loadFile() {
        val fileName = "./src/main/resources/ci.yml"
        val content = getFileAsString(fileName)
        // assertNotNull(content)
        println("foo")
        //assertEquals("foo", "clau", "Content doesn't match")

        val parser = getParser(content)
        // assertEquals("Foo", parser.getValueAsString())
    }

    fun getFileAsString(fileName: String) = File(fileName).readText()

    fun getParser(content: String) = mapper.createParser(content)
}