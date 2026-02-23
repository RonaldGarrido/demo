package com.example.demo.Controller;

import com.example.demo.Entity.EditorEntity;
import com.example.demo.Service.EditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/editor")
public class EditorController {
    private EditorService ediService;

    @Autowired
    public EditorController(EditorService ediService) {
        this.ediService = ediService;
    }

    @PostMapping
    public ResponseEntity<EditorEntity> create(@RequestBody EditorEntity editor) {
        EditorEntity nuevoEditor = ediService.save(editor);
        return new ResponseEntity<>(nuevoEditor, HttpStatus.OK);
    }
}
