package com.example.demo.Service;

import com.example.demo.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudianteService {
    private EstudianteRepository estudianteRepo;
    @Autowired
    public EstudianteService(EstudianteRepository estudianteRepo) {
        this.estudianteRepo = estudianteRepo;
    }

    public EstudianteRepository getEstudiante() {
        return estudianteRepo;
    }

}
