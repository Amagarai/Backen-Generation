package com.example.generatedgroupe.controllers;

import com.example.generatedgroupe.entity.Apprenant;
import com.example.generatedgroupe.services.apprenant.ApprenantServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/apprenant")
public class ApprenantController {

    @Autowired
    ApprenantServiceImp apprenantServiceImp;

    @PostMapping("/add")
    public String save(@RequestBody Apprenant apprenant){
        return apprenantServiceImp.addApprenant(apprenant);
    }

    @GetMapping("/liste")
    public List<Apprenant> liste(){
        return apprenantServiceImp.liste();
    }

    @GetMapping("/aff/{nombre}")
    public List<Apprenant> aff(@PathVariable("nombre") Long nombre){
       return   apprenantServiceImp.find(nombre);
    }
    @GetMapping("/find/{id}")
    public Apprenant trouver(@PathVariable("id") Long id){
        return apprenantServiceImp.findById(id);
    }

    @PostMapping("/modify/{id}")
    public String modifier(Apprenant apprenant,@PathVariable Long id){
        return apprenantServiceImp.modify(apprenant, id);
    }
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        apprenantServiceImp.delete(id);
    }
    @GetMapping("effacer")
    public List<Apprenant> effaccer(){
        return apprenantServiceImp.liste_delete();
    }

}
