package com.cds.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @PostMapping
    public String pay(@RequestBody String request) {
        return "{\"paymentStatus\":\"SIMULATED\",\"reference\":\"PAY-DEMO-001\"}";
    }
}
