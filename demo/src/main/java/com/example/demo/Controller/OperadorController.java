package com.example.demo.Controller;

import com.example.demo.Entity.GestorEntity;
import com.example.demo.Service.OperadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/operador")
public class OperadorController {
    private OperadorService operaService;

    @Autowired
    public OperadorController(OperadorService operadorService) {
        this.operaService = operadorService;
    }

    @GetMapping
    public ResponseEntity<List<GestorEntity>> findAll() {
        List<GestorEntity> operador = (List<GestorEntity>) operaService.getOperadorRepo();
        return new ResponseEntity<>(operador, HttpStatus.OK);
    }
}
