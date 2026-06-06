package com.juvenile.docScale.repository;

import com.juvenile.docScale.domain.Auditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor,Long> {
}
