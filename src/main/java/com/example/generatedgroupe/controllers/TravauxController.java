package com.example.generatedgroupe.controllers;

import com.example.generatedgroupe.entity.Travaux;
import com.example.generatedgroupe.services.travaux.TravauxService;
import com.example.generatedgroupe.services.travaux.TravauxServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/travaux")
public class TravauxController {
    @Autowired
    TravauxServiceImp travauxService;

    @PostMapping("/test")
    public String add(@RequestBody Travaux travaux){
        return travauxService.add(travaux);
    }

    @GetMapping("/liste")
    public List<Travaux> liste(){
        return travauxService.liste();
    }
}
