package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Operador")
public class OperadorEntity  extends UsuarioEntity{
    @Column(name = "areaResponsable",length = 20)
    private String areaResponsable;

}
