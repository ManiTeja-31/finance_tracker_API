package com.FT.finance_tracker_API.DTO;

import com.FT.finance_tracker_API.Entity.CategoryType;
import com.FT.finance_tracker_API.Entity.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionRequestDTO {

    @NotNull
    private Long userId;

    @NotNull
    private Double amount;

    private String Description;

    @NotNull
    private TransactionType type;

    @NotNull
    private Long categoryId;

    @NotNull
    private LocalDate date;

}
