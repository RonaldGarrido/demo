package com.example.demo.Controller;

import com.example.demo.Entity.AdministradorEntity;
import com.example.demo.Service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorController {
    private AdministradorService adminService;

    @Autowired
    public AdministradorController(AdministradorService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public ResponseEntity<List<AdministradorEntity>> findAll() {
        List<AdministradorEntity> admninistrador = adminService.getAdministradores();
        return new ResponseEntity<>(admninistrador, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdministradorEntity> findById(@PathVariable Integer id) {
        return adminService.getAdministradorById(id)
                .map(administrador -> new ResponseEntity<>(administrador,HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/{id}")
    public ResponseEntity<AdministradorEntity> createAdministrador(@RequestBody AdministradorEntity administrador) {
        AdministradorEntity nuevoAdminin = adminService.addAdministrador(administrador);
        return new ResponseEntity<>(nuevoAdminin, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdministradorEntity> updateAdministrador(@PathVariable Integer id, @RequestBody AdministradorEntity administrador) {
        return adminService.getAdministradorById(id)
                .map(administradorExistente ->{
                    administrador.setIdUsuario(id);
                    return new ResponseEntity<>(adminService.updateAdministrador(administrador), HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdministrador(@PathVariable Integer id) {
        return adminService.getAdministradorById(id)
                .map(administrador ->{
                    adminService.deleteAdministrador(id);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
