package com.course.course.resources;

import entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponseDecorator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // The class receives HTTPS requests., methods JASON,XML, text, Targeted feedback in the response body
@RequestMapping(value="/users") //This URL points to this controller/method.
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Maria", "Maria@Gmaail.com", "999999"," 12345");
        return ResponseEntity.ok().body(u);
    }

}
