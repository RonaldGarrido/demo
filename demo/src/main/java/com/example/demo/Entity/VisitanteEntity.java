package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Visitante")
public class VisitanteEntity{
    @Id
    @Column(name = "idTemporal",length = 20)
    private String idTemporal;
}
