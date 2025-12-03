package com.FT.finance_tracker_API.DTO;

import com.FT.finance_tracker_API.Entity.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryRequestDTO {

    @NotNull
    private String categoryName;

    @NotNull
    private TransactionType type;
}
