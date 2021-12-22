package com.example.generatedgroupe.services.apprenant;

import com.example.generatedgroupe.entity.Apprenant;
import com.example.generatedgroupe.entity.Etat;
import com.example.generatedgroupe.repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantServiceImp implements ApprenantService {

    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public String addApprenant(Apprenant apprenant) {
        apprenant.setEtat(Etat.ACTIVER);
        apprenantRepository.save(apprenant);
        return "Apprenant "+apprenant.getNom()+" enregister avec succès";
    }

    @Override
    public List<Apprenant> liste() {
        return apprenantRepository.findAllByEtat(Etat.ACTIVER);
    }

    @Override
    public List<Apprenant> find(Long nombre) {
        return apprenantRepository.getListByIdGreaterThanEqualAndIdLessThanEqual(1L,nombre);
    }

    @Override
    public Apprenant findById(Long id) {
       return apprenantRepository.findById(id).get();
    }

    @Override
    public String modify(Apprenant apprenant,Long id) {
        Apprenant modify= apprenantRepository.findById(id).get();
        apprenant.setNom(modify.getNom());
        apprenant.setEmail(modify.getEmail());
        apprenant.setTel(modify.getTel());
        apprenant.setGroupe(modify.getGroupe());
        return "apprenant "+apprenant.getNom()+" modiier avec succes";
    }

    @Override
    public void delete(Long id) {
        Apprenant apprenant= apprenantRepository.findById(id).get();
        apprenant.setEtat(Etat.DESACTIVER);
    }

    @Override
    public List<Apprenant> liste_delete() {
        return apprenantRepository.findAllByEtat(Etat.DESACTIVER);
    }


}
