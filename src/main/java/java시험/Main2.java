package java시험;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
@Builder
@AllArgsConstructor
class Company {
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
}

public class Main2 {
	public static void main(String[] args) {
	

		Company company = Company.builder()
				.companyId(100)
				.companyName("Apple")
				.address("Apple Computer Inc. 1 infinite Loop")
				.state("CA")
				.zipCode("95014")
				.build();
		
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		
		String Json = gson.toJson(company);
		System.out.println(Json);
		
	}
}
