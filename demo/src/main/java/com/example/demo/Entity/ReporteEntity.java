package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Reporte")
public class ReporteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReporte",length = 20)
    private int idReporte;

    @Column(name = "fechaGeneracion",length = 15)
    private String fechaGeneracion;

    @Column(name = "tipo",length = 30)
    private String tipo;

    @Column(name = "detalles",length = 256)
    private int detalles;

}
