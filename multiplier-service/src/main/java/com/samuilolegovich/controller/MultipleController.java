package com.samuilolegovich.controller;

import com.samuilolegovich.client.CounterClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MultipleController {

    private final CounterClient counterClient;

    @GetMapping("/random")
    public Double multipleNumbers(){
        RandomNumberDto firstNumber = counterClient.getRandomNumber();
        RandomNumberDto secondNumber = counterClient.getRandomNumber();
        return firstNumber.getRandomNumber() * secondNumber.getRandomNumber();
    }

}
