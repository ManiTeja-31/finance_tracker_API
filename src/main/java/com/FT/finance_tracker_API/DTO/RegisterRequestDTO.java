package com.FT.finance_tracker_API.DTO;

import lombok.Data;

@Data
public class RegisterRequestDTO {

    private String userName;
    private String email;
    private String password;
}
