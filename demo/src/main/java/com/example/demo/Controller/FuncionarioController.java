package com.example.demo.Controller;

import com.example.demo.Entity.FuncionarioEntity;
import com.example.demo.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    private FuncionarioService funcioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcioService) {
        this.funcioService = funcioService;
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioEntity>> findAll() {
        List<FuncionarioEntity> funcionario = funcioService.getAllFuncionarios();
        return new ResponseEntity<>(funcionario, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FuncionarioEntity> save(@RequestBody FuncionarioEntity funcionario) {
        FuncionarioEntity nuevoFuncionario = funcioService.saveFuncionario(funcionario);
        return new ResponseEntity<>(nuevoFuncionario, HttpStatus.OK);
    }
}

