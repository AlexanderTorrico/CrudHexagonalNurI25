package com.example.CrudHexagonal.infrastructure.adapters.repositories.jpa.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TaskJpaRepository extends JpaRepository<TaskEntity, Long> {
}
