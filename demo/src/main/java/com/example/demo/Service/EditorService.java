package com.example.demo.Service;

import com.example.demo.Entity.EditorEntity;
import com.example.demo.Repository.EditorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorService {
    private EditorRepository editorRepo;
    @Autowired
    public EditorService(EditorRepository editorRepo) {
        this.editorRepo = editorRepo;
    }
    public EditorEntity save(EditorEntity editor) {
        editorRepo.save(editor);
        return editor;
    }
    public EditorEntity getEditor(Integer id) {
        return (EditorEntity) editorRepo.findAll();
    }
}
