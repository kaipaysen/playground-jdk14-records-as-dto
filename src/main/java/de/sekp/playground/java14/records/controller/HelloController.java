package de.sekp.playground.java14.records.controller;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    public record HelloRequest(
        @JsonProperty("name") String name
    ) {}

    public record HelloResponse(
        @JsonProperty("message") String message
    ) {}

    @RequestMapping(method = RequestMethod.POST)
    public HelloResponse hello(@Valid HelloRequest query) {
        return new HelloResponse("Hello " + query.name());
    }
    
}
