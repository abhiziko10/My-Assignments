package com.coditas.L3EvaluationCode.Model_DTO;

import lombok.Data;

@Data
public class RegisterPlayerDTO {
    private String playerFirstName;
    private String playerLastName;
    private String playerEmail;
    private String password;
}