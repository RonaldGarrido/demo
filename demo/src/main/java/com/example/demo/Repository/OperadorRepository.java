package com.example.demo.Repository;

import com.example.demo.Entity.OperadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorRepository extends JpaRepository<OperadorEntity,Integer> {
}
