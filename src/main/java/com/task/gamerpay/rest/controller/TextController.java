package com.task.gamerpay.rest.controller;

import com.task.gamerpay.dto.request.TextRequestDto;
import com.task.gamerpay.dto.response.TextResponseDto;
import com.task.gamerpay.service.TextService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TextController {

    private final TextService textService;

    @PostMapping("/save-text")
    public ResponseEntity<TextResponseDto> saveText(@RequestBody TextRequestDto textRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(textService.saveText(textRequestDto));
    }
}
