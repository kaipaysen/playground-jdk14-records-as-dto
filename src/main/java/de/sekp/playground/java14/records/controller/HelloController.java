package de.sekp.playground.java14.records.controller;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
        
    public record HelloRequest(
        String name, 
        String zzz  // 2nd field is required by jackson
    ) {}

    public record HelloResponse(
        @JsonProperty("message") String message
    ) {}

    @RequestMapping(method = RequestMethod.POST)
    public HelloResponse hello(@RequestBody @Valid HelloRequest query) {
        return new HelloResponse("Hello " + query.name());
    }
   
}
