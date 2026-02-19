package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Usuario")
public class UsuarioEntity {
    @Id
    @Column(name = "idUsuario", length = 100)
    private int idUsuario;

    @Column(name = "nombre",length = 100)
    private String nombre;

    @Column(name = "correo",length = 50)
    private String correo;

    @Column(name = "contraseña",length = 50)
    private String contraseña;
}
