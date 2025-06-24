package design.pattern.example;

import lombok.Data;

@Data
public class ResponseDto {
	private HeaderResponse header;
	private BodyResponse body;
}
