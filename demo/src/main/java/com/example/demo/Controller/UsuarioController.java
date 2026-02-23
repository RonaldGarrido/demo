package com.example.demo.Controller;

import com.example.demo.Entity.UsuarioEntity;
import com.example.demo.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private UsuarioService usuService;

    @Autowired
    public UsuarioController(UsuarioService usuService) {
        this.usuService = usuService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> findAll() {
        List<UsuarioEntity> usuarios = usuService.getAllUsuarios();
        return new ResponseEntity<>(usuarios,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioEntity> findById(@PathVariable Integer id) {
        return usuService.getUsuarioById(id)
                .map(usuario -> new ResponseEntity<>(usuario,HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<UsuarioEntity> createUsuario(@RequestBody UsuarioEntity usuario)  {
        UsuarioEntity nuevoUsuario = usuService.addUsuario(usuario);
        return new ResponseEntity<>(nuevoUsuario,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioEntity> updateUsuario(@PathVariable Integer id, @RequestBody UsuarioEntity usuario) {
        return usuService.getUsuarioById(id)
                .map(usuarioExiste ->{
                    usuario.setIdUsuario(id);
                    return new ResponseEntity<>(usuService.updateUsuario(usuario),HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
        return usuService.getUsuarioById(id)
                .map(usuario ->{
                    usuService.deleteUsuario(id);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

}



