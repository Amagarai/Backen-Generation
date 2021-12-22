package com.example.generatedgroupe.services.groupe;

import com.example.generatedgroupe.entity.Groupe;

import java.util.List;

public interface GroupeService {
    public void add(Groupe groupe);
    public List<Groupe> liste();
    public String modify(Groupe groupe, Long id);
}
