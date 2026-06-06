package com.juvenile.docScale.repository;

import com.juvenile.docScale.domain.FileMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileMetadataRepo extends JpaRepository<FileMetadata,Long> {
}
