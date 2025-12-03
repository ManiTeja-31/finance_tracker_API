package com.FT.finance_tracker_API.DTO;

import lombok.Data;

@Data
public class SummaryResponseDTO {

    private Double totalIncome;

    private Double totalExpense;

    private double balance;
}
