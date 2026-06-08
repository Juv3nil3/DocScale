package com.juvenile.docScale.controller;

import com.juvenile.docScale.service.StorageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

@RestController
@RequestMapping("/api/v1/docs")
public class DocsController {

    private final StorageService storageService;

    public DocsController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/")
    public ResponseEntity<String> saveDocument(@RequestParam("file") MultipartFile file) throws IOException {
        String docuementUUID = storageService.saveDocument(file);
        return ResponseEntity.ok("File saved successfully, heres the id: "+docuementUUID);
    }

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<Void> handleFileNotFound(FileNotFoundException ex){
        return ResponseEntity.notFound().build();
    }
}
