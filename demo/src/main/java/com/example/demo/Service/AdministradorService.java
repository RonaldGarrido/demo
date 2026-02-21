package com.example.demo.Service;

import com.example.demo.Entity.AdministradorEntity;
import com.example.demo.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AdministradorService {
    private AdministradorRepository administradorRepo;

    @Autowired
    public AdministradorService(AdministradorRepository administradorRepo) {
        this.administradorRepo = administradorRepo;
    }

    public AdministradorEntity addAdministrador(AdministradorEntity administrador) {
        return administradorRepo.save(administrador);
    }
    public List<AdministradorEntity> getAdministradores() {
        return administradorRepo.findAll();
    }
    public Optional<AdministradorEntity> getAdministrador(Integer IdUsuario) {
        return administradorRepo.findById(IdUsuario);
    }
    public AdministradorEntity updateAdministrador(AdministradorEntity administrador) {
        return administradorRepo.save(administrador);
    }
    public void deleteAdministrador(Integer IdUsuario) {

    }
}
