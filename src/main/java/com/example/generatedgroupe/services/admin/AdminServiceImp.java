package com.example.generatedgroupe.services.admin;

import com.example.generatedgroupe.entity.Admnistrateur;
import com.example.generatedgroupe.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService{

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admnistrateur loginAdmin(String login, String password) {
        return adminRepository.findAdmnistrateurByLoginAndPassword(login, password);
    }
}
