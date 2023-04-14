package br.com.p3d50.chatgtp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.p3d50.chatgtp.service.ChatGPTService;

@Controller
public class ChatGPTController {

	@Autowired
	ChatGPTService service;

	@PostMapping("/prompt")
	public ResponseEntity<String> getPrompt(@RequestBody String body) {

		try {
			return service.getPrompt(body);
		} catch (Exception e) {
			return null;
		}
	}

}
