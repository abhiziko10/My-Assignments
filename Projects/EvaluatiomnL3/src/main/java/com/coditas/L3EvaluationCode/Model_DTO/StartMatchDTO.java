package com.coditas.L3EvaluationCode.Model_DTO;

import lombok.Data;

@Data
public class StartMatchDTO {
    private long playerOneId;
    private long playerTwoId;
    private String matchName;
}