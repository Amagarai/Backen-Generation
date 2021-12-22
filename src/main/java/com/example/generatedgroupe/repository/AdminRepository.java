package com.example.generatedgroupe.repository;

import com.example.generatedgroupe.entity.Admnistrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admnistrateur, Long> {
}
