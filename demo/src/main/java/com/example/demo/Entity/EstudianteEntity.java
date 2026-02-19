package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Estudiante")
public class EstudianteEntity extends UsuarioEntity{
    @Column(name = "carrera",length = 50)
    private String carrera;

    @Column(name = "matricula",length = 50)
    private String matricula;

}
