package com.example.demo.Service;

import com.example.demo.Repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService {
    private VisitanteRepository visitanteRepo;
    @Autowired
    public VisitanteService(VisitanteRepository visitanteRepo) {
        this.visitanteRepo = visitanteRepo;
    }

}
