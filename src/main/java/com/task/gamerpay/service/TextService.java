package com.task.gamerpay.service;

import com.task.gamerpay.dto.mapper.Mapper;
import com.task.gamerpay.dto.request.TextRequestDto;
import com.task.gamerpay.dto.response.TextResponseDto;
import com.task.gamerpay.persistence.entity.TextEntity;
import com.task.gamerpay.persistence.repository.TextRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
public class TextService {

    private final TextRepository textRepository;
    private final Mapper mapper;

    public TextResponseDto saveText(@Valid TextRequestDto textRequestDto) {
        TextEntity textEntity = mapper.toEntity(textRequestDto);
        return mapper.toDto(textRepository.save(textEntity));
    }
}
