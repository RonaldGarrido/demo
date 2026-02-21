package com.example.demo.Service;

import com.example.demo.Entity.BitacoraEntity;
import com.example.demo.Repository.BitacoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BitacoraService {
    private BitacoraRepository bitacoraRepo;

    @Autowired
    public BitacoraService(BitacoraRepository bitacoraRepo) {
        this.bitacoraRepo = bitacoraRepo;
    }
    public BitacoraEntity save(BitacoraEntity bitacoraEntity) {
        return bitacoraRepo.save(bitacoraEntity);
    }
    public List<BitacoraEntity> findAll() {
        return bitacoraRepo.findAll();
    }
}
