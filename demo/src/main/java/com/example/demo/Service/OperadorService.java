package com.example.demo.Service;

import com.example.demo.Repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperadorService {
    private OperadorRepository operadorRepo;
    @Autowired
    public OperadorService(OperadorRepository operadorRepo) {
        this.operadorRepo = operadorRepo;
    }

}
