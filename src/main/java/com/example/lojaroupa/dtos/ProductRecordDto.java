package com.example.lojaroupa.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotBlank String color, String[] gender, String[] category, String[] size, @NotNull BigDecimal price, String[] cover) {
    
}
