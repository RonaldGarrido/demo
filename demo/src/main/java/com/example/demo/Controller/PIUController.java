package com.example.demo.Controller;

import com.example.demo.Entity.PIUEntity;
import com.example.demo.Service.PIUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/piu")
public class PIUController {
    private PIUService piuService;

    @Autowired
    public PIUController(PIUService piuService) {
        this.piuService = piuService;
    }

    @GetMapping
    public ResponseEntity<List<PIUEntity>> findAll() {
        List<PIUEntity> piu = (List<PIUEntity>) piuService.getAllPIU();
        return new ResponseEntity<>(piu, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PIUEntity findById(@PathVariable int id) {
        return piuService.getPIU(id);
    }
}
