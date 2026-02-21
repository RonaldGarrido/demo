package com.example.demo.Service;

import com.example.demo.Entity.ProfesorEntity;
import com.example.demo.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {
    private ProfesorRepository profesorRepo;
    @Autowired
    public ProfesorService(ProfesorRepository profesorRepo) {
        this.profesorRepo = profesorRepo;
    }
    public ProfesorEntity addProfesor(ProfesorEntity profesor) {
        return profesorRepo.save(profesor);
    }
    public List<ProfesorEntity> getAllProfesor() {
        return profesorRepo.findAll();
    }
    public ProfesorEntity getProfesorById(int id) {
        return profesorRepo.findById(id).get();
    }

}
