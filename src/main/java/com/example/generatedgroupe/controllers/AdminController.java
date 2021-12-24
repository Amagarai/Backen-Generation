package com.example.generatedgroupe.controllers;

import com.example.generatedgroupe.entity.Admnistrateur;
import com.example.generatedgroupe.services.admin.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    AdminServiceImp adminServiceImp;

    @GetMapping("/login")
    Admnistrateur connexion(@RequestParam String login, @RequestParam String password){
        return adminServiceImp.loginAdmin(login, password);
    }
}
