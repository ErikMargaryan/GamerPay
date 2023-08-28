package com.task.gamerpay.dto.mapper;

import com.task.gamerpay.dto.request.TextRequestDto;
import com.task.gamerpay.dto.response.TextResponseDto;
import com.task.gamerpay.persistence.entity.TextEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    TextEntity toEntity(TextRequestDto dto);

    TextResponseDto toDto(TextEntity entity);
}
