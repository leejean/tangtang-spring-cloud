package com.lijuyong.startup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john on 2017/2/24.
 */
@RestController
@RequestMapping("/order-service/stat")
public class OrderStat {
    @RequestMapping("/count")
    public int count(){
        return 2046;
    }
}
