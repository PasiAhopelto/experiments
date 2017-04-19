package github.pasiahopelto.spring.client;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SimpleRestClient {

	public static void main(String[] args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/simplistics", String.class);
		if(response.getStatusCode().is2xxSuccessful()) {
			printJsonNode(response);
		}
		else {
			System.out.println("Failed with " + response.getStatusCode());
		}
	}

	private static void printJsonNode(ResponseEntity<String> response) throws IOException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(response.getBody());
		System.out.println("Result: " + root);
	}

}
