package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Profesor")
public class ProfesorEntity extends UsuarioEntity{
    @Column(name = "departamento",length = 50)
    private String departamento;
}
