package com.controller;

import com.model.AnimalFact;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class AnimalFactController {

public AnimalFact[] getAnimalFact(){
 RestTemplate restTemplate=new RestTemplate();

 ResponseEntity<AnimalFact[]> exchange=restTemplate.exchange(
         "https://cat-fact.herokuapp.com/facts/random?animal_type=dog&amount=5",
         HttpMethod.GET,
         HttpEntity.EMPTY,
         AnimalFact[].class
 );
    System.out.println("Status code"+ exchange.getStatusCode());

    return exchange.getBody();
}

}
