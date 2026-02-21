package com.example.demo.Repository;

import com.example.demo.Entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity,String> {
}
