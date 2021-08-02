package com.samuilolegovich.controller;

import com.samuilolegovich.dto.RandomNumberDto;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping
public class CounterController {

    @GetMapping("/random-count")
    public RandomNumberDto getCount(@AuthenticationPrincipal Jwt jwt) {
        Random random = new Random(System.nanoTime());
        return new RandomNumberDto(random.nextDouble());
    }
}
