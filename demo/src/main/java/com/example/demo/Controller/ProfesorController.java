package com.example.demo.Controller;

import com.example.demo.Entity.ProfesorEntity;
import com.example.demo.Service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
    private ProfesorService profService;

    @Autowired
    public ProfesorController(ProfesorService profService) {
        this.profService = profService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesorEntity>> findAll() {
        List<ProfesorEntity> profesor = profService.getAllProfesor();
        return new ResponseEntity<>(profesor, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProfesorEntity> create(@RequestBody ProfesorEntity profesor) {
        ProfesorEntity nuevoProfesor = profService.addProfesor(profesor);
        return new ResponseEntity<>(nuevoProfesor, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesorEntity> findById(@PathVariable int id) {
        ProfesorEntity profesor = profService.getProfesorById(id);
        return new ResponseEntity<>(profesor, HttpStatus.OK);
    }
}
