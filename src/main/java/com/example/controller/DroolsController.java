package com.example.controller;

import com.example.model.Message;
import com.example.service.DroolsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drools")
public class DroolsController {

    private final DroolsService droolService;

    public DroolsController(DroolsService droolService) {
        this.droolService = droolService;
        System.out.println("DroolsController initialized");
    }

    @PostMapping("/process")
    public ResponseEntity<Message> processMessage(@RequestBody Message message) {
        Message processed = droolService.processMessage(message);
        return ResponseEntity.ok(processed);
    }
}
