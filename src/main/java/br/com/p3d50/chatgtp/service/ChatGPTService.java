package br.com.p3d50.chatgtp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;

@Service
public class ChatGPTService {

	public ResponseEntity<String> getPrompt(String prompt) {

		final String API_KEY = "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";

		OpenAiService service = new OpenAiService(API_KEY);

		CompletionRequest request = CompletionRequest.builder()
				.model("text-davinci-003")
				.prompt(prompt)
				.maxTokens(375)
				.build();
		
		CompletionResult response = service.createCompletion(request);

		return ResponseEntity.ok(response.getChoices().get(0).getText());
	}

}
