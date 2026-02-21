package com.example.demo.Repository;

import com.example.demo.Entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Integer> {
}
