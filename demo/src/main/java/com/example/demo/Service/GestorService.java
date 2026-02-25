package com.example.demo.Service;

import com.example.demo.Repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestorService {
    private GestorRepository gestorRepo;
    @Autowired
    public GestorService(GestorRepository gestorRepository) {
        this.gestorRepo = gestorRepository;
    }

    public GestorRepository getGestorRepo() {
        return gestorRepo;
    }


}
