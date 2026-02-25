package com.example.demo.Controller;

import com.example.demo.Entity.VisitanteEntity;
import com.example.demo.Service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitante")
public class VisitanteController {
    private VisitanteService visitaService;

    @Autowired
    public VisitanteController(VisitanteService visitaService) {
        this.visitaService = visitaService;
    }

    @GetMapping
    public ResponseEntity<List<VisitanteEntity>> findAll() {
        List<VisitanteEntity> visitante = visitaService.getVisitanteRepo().findAll();
        return new ResponseEntity<>(visitante, HttpStatus.OK);
    }

}
