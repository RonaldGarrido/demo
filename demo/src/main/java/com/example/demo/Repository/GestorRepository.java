package com.example.demo.Repository;

import com.example.demo.Entity.GestorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestorRepository extends JpaRepository<GestorEntity,Integer> {
}
