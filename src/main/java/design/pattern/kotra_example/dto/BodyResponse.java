package design.pattern.kotra_example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BodyResponse {

	private ItemsResponse items;
	private Integer pageNo;
	private Integer totalCount;
	private Integer numOfRows;

	@Data
	public static class ItemsResponse {
		private List<ItemResponse> item;
	}

	@Data
	public static class ItemResponse {
		private String udpateDate;
		private List<Integer> yearList;
		private List<PaymentTerms> paymentTerms;
		private List<YearValue> averagePaymentPeriod;
		private List<YearValue> latePaymentRate;
		private List<YearValue> averagelatePaymentPeriod;
		private List<PaymentPeriod> paymentPeriod;
	}

	@Data
	public static class PaymentTerms {
		@JsonProperty("CODE")
		private String code;

		@JsonProperty("PAYMENT_TERMS")
		private List<PaymentTermsItem> paymentTerms;

		@JsonProperty("CODE_NM")
		private String codeNm;
	}

	@Data
	public static class PaymentTermsItem {
		@JsonProperty("YEAR")
		private String year;

		@JsonProperty("CNT")
		private Double cnt;

		@JsonProperty("VALUE")
		private Double value;
	}

	@Data
	public static class YearValue {
		@JsonProperty("YEAR")
		private String year;

		@JsonProperty("VALUE")
		private Double value;
	}

	@Data
	public static class PaymentPeriod {
		@JsonProperty("CODE")
		private String code;

		@JsonProperty("PAYMENT_PERIOD")
		private List<PaymentTermsItem> paymentPeriod;

		@JsonProperty("CODE_NM")
		private String codeNm;
	}
}
