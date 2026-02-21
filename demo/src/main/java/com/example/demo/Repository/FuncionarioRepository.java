package com.example.demo.Repository;

import com.example.demo.Entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,Integer> {
}
