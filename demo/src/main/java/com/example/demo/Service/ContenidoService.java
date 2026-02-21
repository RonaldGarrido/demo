package com.example.demo.Service;

import com.example.demo.Entity.ContenidoEntity;
import com.example.demo.Repository.ContenidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContenidoService {
    private ContenidoRepository contenidoRepo;

    @Autowired
    public ContenidoService(ContenidoRepository contenidoRepo) {
        this.contenidoRepo = contenidoRepo;
    }
    public ContenidoEntity getContenido(Integer id) {
        return contenidoRepo.findById(id).get();
    }
    public List<ContenidoEntity> getAllContenidos() {
        return contenidoRepo.findAll();
    }
}
