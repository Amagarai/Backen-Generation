package com.example.generatedgroupe.controllers;

import com.example.generatedgroupe.entity.Groupe;
import com.example.generatedgroupe.services.groupe.GroupeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/groupe")
@CrossOrigin("*")
public class GroupeController {
    @Autowired
    GroupeServiceImp groupeServiceImp;

    @PostMapping("/add")
    public void add(@RequestBody Groupe groupe){
         groupeServiceImp.add(groupe);
    }
    @GetMapping("liste")
    public List<Groupe> liste(){
        return groupeServiceImp.liste();
    }
}
