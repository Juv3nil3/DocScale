package com.juvenile.docScale.service;


import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@Service
public class LocalStorageService implements StorageService{


    @Override
    public String saveDocument(MultipartFile file)throws IOException {

        UUID uuid = UUID.randomUUID();
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        String name = extension +"."+ uuid;

        Path directoryPath = Path.of("data");
        Files.createDirectories(directoryPath);

        file.transferTo(Path.of("data", name));
        return uuid.toString();
    }

    @Override
    public MultipartFile getDocument(UUID uuid) {
        return null;
    }
}
