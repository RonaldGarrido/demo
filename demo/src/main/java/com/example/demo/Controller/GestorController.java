package com.example.demo.Controller;

import com.example.demo.Entity.FuncionarioEntity;
import com.example.demo.Entity.GestorEntity;
import com.example.demo.Service.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gestor")
public class GestorController {
    private GestorService gestService;

    @Autowired
    public GestorController(GestorService gestorService) {
        this.gestService = gestorService;
    }

    @GetMapping
    public ResponseEntity<List<GestorEntity>> findAll() {
        List<GestorEntity> gestor = (List<GestorEntity>) gestService.getGestorRepo();
        return new ResponseEntity<>(gestor,HttpStatus.OK);
    }

}
