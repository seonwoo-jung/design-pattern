package design.pattern.kotra_example;

import com.fasterxml.jackson.databind.ObjectMapper;
import design.pattern.kotra_example.dto.ResponseHandler;
import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Slf4j
public class ReaderMain {

	public static void main(String[] args) throws IOException {
		Resource resource = new ClassPathResource("example.json");
		InputStream is = resource.getInputStream();
		ResponseHandler response = new ObjectMapper().readValue(is, ResponseHandler.class);
		String prettyResponse = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response);

		log.info("response => {}", prettyResponse);
	}
}
