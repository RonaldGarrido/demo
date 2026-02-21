package com.example.demo.Repository;

import com.example.demo.Entity.BitacoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BitacoraRepository extends JpaRepository<BitacoraEntity,Integer> {
}
