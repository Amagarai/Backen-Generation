package com.example.generatedgroupe.repository;

import com.example.generatedgroupe.entity.Apprenant;
import com.example.generatedgroupe.entity.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
    public List<Apprenant> getListByIdGreaterThanEqualAndIdLessThanEqual(Long un, Long nbre);
    public  List<Apprenant> findAllByEtat(Etat etat);
}
