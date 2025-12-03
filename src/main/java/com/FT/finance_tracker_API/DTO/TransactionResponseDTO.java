package com.FT.finance_tracker_API.DTO;

import com.FT.finance_tracker_API.Entity.TransactionType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class TransactionResponseDTO {

    private Long Id;

    private Double amount;

    private String description;

    private TransactionType type;

    private LocalDate date;

    private String categoryName;

    private String userName;

    private LocalDateTime createdAt;
}
