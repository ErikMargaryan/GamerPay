package com.task.gamerpay.persistence.repository;

import com.task.gamerpay.persistence.entity.TextEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<TextEntity, Long> {
}
