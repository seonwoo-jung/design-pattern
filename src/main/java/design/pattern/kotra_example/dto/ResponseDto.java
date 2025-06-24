package design.pattern.kotra_example.dto;

public record ResponseDto(
	HeaderResponse header,
	BodyResponse body
) {
}
