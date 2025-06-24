package design.pattern.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
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
		WrapperDTO dto = new ObjectMapper().readValue(is, WrapperDTO.class);
	}
}
