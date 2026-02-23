package com.example.demo.Controller;

import com.example.demo.Entity.BitacoraEntity;
import com.example.demo.Service.BitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bitacora")
public class BitacoraController {
    private BitacoraService bitaService;

    @Autowired
    public BitacoraController(BitacoraService bitaService) {
        this.bitaService = bitaService;
    }

    @GetMapping
    public ResponseEntity<List<BitacoraEntity>> findAll() {
        List<BitacoraEntity> bitacora = bitaService.findAll();
        return new ResponseEntity<>(bitacora, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BitacoraEntity> create(@RequestBody BitacoraEntity bitacora) {
        BitacoraEntity nuevaBitacora = bitaService.save(bitacora);
        return new ResponseEntity<>(nuevaBitacora, HttpStatus.OK);
    }

}
