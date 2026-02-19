package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PIU")
public class PIUEntity {
    @Id
    @Column(name = "idPIU",length = 100)
    private int idPIU;

    @Column(name = "ubicacion",length = 100)
    private String ubicacion;

    @Column(name = "estado",length = 50)
    private String estado;

    @Column(name = "version",length = 10)
    private Long version;
}
