package com.example.demo.Repository;

import com.example.demo.Entity.ContenidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContenidoRepository extends JpaRepository<ContenidoEntity,Integer> {
}
