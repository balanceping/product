package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ph
 * @create 2019--08-09
 */
@RestController
@Slf4j
public class ClientController {

  /*  @Autowired
    private LoadBalancerClient loadBalancerClient;*/

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsd")
    public String getProductMsg(){
        //第一种方式  直接使用RestTemplate   url是写死的
        /*RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8081/msg", String.class);
        log.info("response ={}",response);*/

        //第二种方式 利用loadBalancerClient 通过应用名获取url ，再使用RestTemplate
        /*ServiceInstance serviceInstance = loadBalancerClient.choose("product");

        String url = String.format("http://%s:%s",        serviceInstance.getHost(),serviceInstance.getPort()) + "msg";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response ={}",response);*/

        //第三种方式  配置RestTemplateConfig 利用@LoadBalanced 获取RestTemplate 注入进来
        String response =restTemplate.getForObject("http://PRODUCT/msg",String.class);
        log.info("response ={}",response);
        return  response;
    }
}
