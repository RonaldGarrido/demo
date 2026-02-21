package com.example.demo.Service;

import com.example.demo.Entity.PIUEntity;
import com.example.demo.Repository.PIURepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PIUService {
    private PIURepository piuRepo;
    @Autowired
    public PIUService(PIURepository piuRepo) {
        this.piuRepo = piuRepo;
    }
    public PIUEntity getPIU(int id) {
        return piuRepo.findById(id).get();
    }
    public List<PIUEntity> getAllPIU() {
        return piuRepo.findAll();
    }
}
