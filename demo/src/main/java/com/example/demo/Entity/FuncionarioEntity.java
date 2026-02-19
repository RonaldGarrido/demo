package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Funcionario")
public class FuncionarioEntity extends UsuarioEntity{
    @Column(name = "unidad",length = 20)
    private String unidad;

}
