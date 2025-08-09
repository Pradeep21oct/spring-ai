package com.spring.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {

    @GetMapping("/api/{input}")
    public String getResponse(@PathVariable String  input) {
        // This method would contain logic to interact with OpenAI's API
        // and return a response based on the input.
        return "Response from OpenAI for input: " + input;
    }


}
