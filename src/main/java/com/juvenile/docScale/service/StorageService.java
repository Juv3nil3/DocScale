package com.juvenile.docScale.service;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

public interface StorageService {

    String saveDocument(MultipartFile file) throws IOException;
    MultipartFile getDocument(UUID documentId);
}
