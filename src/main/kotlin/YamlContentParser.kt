package hackl.projekt

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory

class YamlContentParser {

        private val mapper = YAMLFactory()

    fun getParser(content: String) = mapper.createParser(content)
}