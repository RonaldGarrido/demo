package com.example.demo.Service;

import com.example.demo.Repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {
    private ReporteRepository reporteRepo;
    @Autowired
    public ReporteService(ReporteRepository reporteRepo) {
        this.reporteRepo = reporteRepo;
    }

    public ReporteRepository getReporteRepo() {
        return reporteRepo;
    }


}
