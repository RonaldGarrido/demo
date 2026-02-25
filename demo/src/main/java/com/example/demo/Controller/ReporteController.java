package com.example.demo.Controller;

import com.example.demo.Service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reporte")
public class ReporteController {
    private ReporteService reportService;

    @Autowired
    public ReporteController(ReporteService reportService) {
        this.reportService = reportService;
    }

    public ResponseEntity<List<ResponseEntity>> find() {
        List<ResponseEntity> reporte = (List<ResponseEntity>) reportService.getReporteRepo();
        return new ResponseEntity<>(reporte, HttpStatus.OK);
    }
}
