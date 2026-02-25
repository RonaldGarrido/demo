package com.example.demo.Controller;

import com.example.demo.Entity.EstudianteEntity;
import com.example.demo.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
    private EstudianteService estudService;

    @Autowired
    public EstudianteController(EstudianteService estudService) {
        this.estudService = estudService;
    }

    @GetMapping
    private ResponseEntity<List<EstudianteEntity>> findAll() {
        List<EstudianteEntity> estudiante = (List<EstudianteEntity>) estudService.getEstudiante();
        return new ResponseEntity<>(estudiante, HttpStatus.OK);
    }
}
