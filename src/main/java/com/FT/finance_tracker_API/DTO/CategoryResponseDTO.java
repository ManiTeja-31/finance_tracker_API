package com.FT.finance_tracker_API.DTO;

import com.FT.finance_tracker_API.Entity.CategoryType;
import com.FT.finance_tracker_API.Entity.TransactionType;
import lombok.Data;

@Data
public class CategoryResponseDTO {

    private Long id;

    private CategoryType name;

    private TransactionType type;

}
