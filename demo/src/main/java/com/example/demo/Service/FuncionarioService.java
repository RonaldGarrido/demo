package com.example.demo.Service;

import com.example.demo.Entity.FuncionarioEntity;
import com.example.demo.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
}
