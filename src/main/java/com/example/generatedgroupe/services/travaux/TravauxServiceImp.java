package com.example.generatedgroupe.services.travaux;

import com.example.generatedgroupe.entity.Apprenant;
import com.example.generatedgroupe.entity.Groupe;
import com.example.generatedgroupe.entity.Travaux;
import com.example.generatedgroupe.repository.GroupeRepository;
import com.example.generatedgroupe.repository.TravauxRepository;
import com.example.generatedgroupe.services.apprenant.ApprenantService;
import com.example.generatedgroupe.services.groupe.GroupeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravauxServiceImp implements TravauxService{

    @Autowired
    TravauxRepository travauxRepository;
    @Autowired
    GroupeServiceImp groupeServiceImp;

    @Autowired
    GroupeRepository groupeRepository;

    @Autowired
    ApprenantService apprenantService;

    @Override
    public String add(Travaux travaux) {

        List<Apprenant> total= apprenantService.liste();
        int taille =total.size();
        int nombre= travaux.getNombre();

        int GenerateGroupe= taille/nombre;
        if ((taille%nombre)==0){
            for (int i=1; i<=GenerateGroupe; i++){
                Groupe groupe = new Groupe();
                groupe.setNom("Groupes " +i);
                groupe.setTravaux(travaux);
                groupe.setNombre(GenerateGroupe);
                groupeServiceImp.add(groupe);
                /**for (int j=1; j<taille+1; j++){
                    Long cast= new Long(j);
                    Apprenant apprenant=  apprenantService.findById(cast);
                    for (int k = 1; k<nombre; k++){


                    }
                    apprenant.setGroupe(groupe);
                }**/
            }
            travauxRepository.save(travaux);
            return "fait";
       }
        return "c'est OK";
    }
    void atribute(){

    }

    @Override
    public List<Travaux> liste() {
        return travauxRepository.findAll();
    }
}
