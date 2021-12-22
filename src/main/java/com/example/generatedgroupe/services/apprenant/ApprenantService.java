package com.example.generatedgroupe.services.apprenant;

import com.example.generatedgroupe.entity.Apprenant;

import java.util.List;

public interface ApprenantService {
    public String addApprenant(Apprenant apprenant);
    public List<Apprenant> liste();
    public List<Apprenant> find(Long nombre);
    public Apprenant findById(Long id);
    public String modify(Apprenant apprenant,Long id);
    public void delete(Long id);
    public List<Apprenant> liste_delete();


}
