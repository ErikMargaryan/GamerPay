package com.task.gamerpay.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TextRequestDto implements Serializable {
    @NotBlank(message = "Text may not be empty, null or blank")
    private String text;
    @JsonIgnore
    private LocalDateTime localDateTime = LocalDateTime.now();
}
