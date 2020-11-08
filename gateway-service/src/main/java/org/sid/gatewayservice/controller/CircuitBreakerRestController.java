package org.sid.gatewayservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CircuitBreakerRestController {

    @GetMapping("/defaultCustomers")
    public Map<String, String> customers() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "default Customers");
        data.put("customers", " Guitt bahia, boumediene ikram ,.....");
        return data;
    }

    @GetMapping("/defaultProducts")
    public Map<String, String> products() {
        Map<String, String> data = new HashMap<>();
        data.put("message", "default Products");
        data.put("products", " Audi A3, Mini cooper ,.....");
        return data;
    }
}
