package com.hei.school.endpoint;

import com.hei.school.service.CalculService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculController {
    private final CalculService calculService;

    public CalculController(CalculService calculService) {
        this.calculService = calculService;
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> add(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calculService.add(a,b));
    }

    @GetMapping("/sub")
    public ResponseEntity<Integer> sub(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calculService.sub(a,b));
    }

    @GetMapping("/mul")
    public ResponseEntity<Integer> mul(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calculService.mul(a,b));
    }

    @GetMapping("/div")
    public ResponseEntity<Integer> div(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(calculService.div(a,b));
    }
}