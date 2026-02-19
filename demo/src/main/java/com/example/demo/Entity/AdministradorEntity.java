package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Administrador")
public class AdministradorEntity extends UsuarioEntity{
    @Column(name = "versionPIUInstalada",length = 20)
    private String versionPIUInstalada;

}
