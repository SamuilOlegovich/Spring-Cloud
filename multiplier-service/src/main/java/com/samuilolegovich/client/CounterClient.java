package com.samuilolegovich.client;

import com.iwis.cloudlesson.dto.RandomNumberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("counter-service")
public interface CounterClient {


    @GetMapping("/counter/random-count")
    RandomNumberDto getRandomNumber();


}
