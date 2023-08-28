package com.task.gamerpay.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TextResponseDto {
    private Long id;
    private String text;
    private LocalDateTime localDateTime;
}
