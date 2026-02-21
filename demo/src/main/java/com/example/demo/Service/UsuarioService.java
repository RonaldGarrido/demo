package com.example.demo.Service;

import com.example.demo.Entity.UsuarioEntity;
import com.example.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioService {
    private UsuarioRepository usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public UsuarioEntity addUsuario(UsuarioEntity usuario) {
        return usuarioRepo.save(usuario);
    }
    public List<UsuarioEntity> getAllUsuarios() {
        return usuarioRepo.findAll();
    }
    public Optional<UsuarioEntity> getUsuarioById(Integer id) {
        return usuarioRepo.findById(id);
    }
    public UsuarioEntity updateUsuario(UsuarioEntity usuario) {
        return usuarioRepo.save(usuario);
    }
    public void deleteUsuario(Integer id) {
        usuarioRepo.deleteById(id);
    }

}
