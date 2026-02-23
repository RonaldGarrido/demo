package com.example.demo.Controller;

import com.example.demo.Entity.ContenidoEntity;
import com.example.demo.Service.ContenidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contenido")
public class ContenidoController {
    private ContenidoService conteService;

    @Autowired
    public ContenidoController(ContenidoService conteService) {
        this.conteService = conteService;
    }

    @GetMapping
    public ResponseEntity<List<ContenidoEntity>> findAll() {
        List<ContenidoEntity> contenido = conteService.getAllContenidos();
        return new ResponseEntity<>(contenido, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContenidoEntity> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(conteService.getContenidoById(id), HttpStatus.OK);

    }
}
