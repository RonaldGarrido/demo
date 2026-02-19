package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "Bitacora")
public class BitacoraEntity extends UsuarioEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBitacora",length = 20)
    private int idBitacora;

    @Column(name = "fecha",length = 15)
    private Date fecha;

    @Column(name = "evento",length = 30)
    private String evento;

    @Column(name = "usuarioSolicitante",length = 30)
    private int usuarioSolicitante;

}
