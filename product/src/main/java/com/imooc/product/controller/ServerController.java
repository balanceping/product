package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ph
 * @create 2019--08-09
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg(){
        return  "这是product msg";
    }
}
