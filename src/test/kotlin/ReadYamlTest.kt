import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ReadYamlTest {

    private val mapper = YAMLFactory()

    @Test
    fun loadFile() {
        val fileName = "/Users/claudia.nunez/Projects/acrolinx_interview/src/main/resources/ci.yml"
        val content = getFileAsString(fileName)
        assertNotNull(content)

        val parser = getParser(content)
        assertEquals(parser.getValueAsString(), "Foo")
    }

    fun getFileAsString(fileName: String) = File(fileName).readText()

    fun getParser(content: String) = mapper.createParser(content)
}