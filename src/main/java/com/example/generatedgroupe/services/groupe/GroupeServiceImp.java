package com.example.generatedgroupe.services.groupe;

import com.example.generatedgroupe.entity.Apprenant;
import com.example.generatedgroupe.entity.Groupe;
import com.example.generatedgroupe.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImp implements GroupeService{

    @Autowired
    GroupeRepository groupeRepository;

    @Override
    public List<Groupe> liste() {
        return groupeRepository.findAll();
    }

    @Override
    public String modify(Groupe groupe, Long id) {
        Groupe modify= groupeRepository.getById(id);
        groupe.setNom(modify.getNom());
        groupe.setApprenants(modify.getApprenants());
        groupe.setTravaux((modify.getTravaux()));
        return "groupe modifier avec succes";
    }

    @Override
    public void add(Groupe groupe) {
        groupeRepository.save(groupe);
    }

}
