package com.example.demo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "Contenido")
public class ContenidoEntity {
    @Id
    @Column(name = "idContenido",length = 20)
    private Integer idContenido;

    @Column(name = "titulo",length = 30)
    private String titulo;

    @Column(name = "descripcion",length = 200)
    private String descripcion;

    @Column(name = "tipo",length = 50)
    private String tipo;

    @Column(name = "fechaCreacion",length = 15)
    private Date fechaCreacion;

    @Column(name = "fechaModificacion",length = 15)
    private Date fechaModificacion;
}
