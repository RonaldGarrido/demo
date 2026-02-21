package com.example.demo.Repository;

import com.example.demo.Entity.EditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorRepository extends JpaRepository<EditorEntity, Integer> {
}
