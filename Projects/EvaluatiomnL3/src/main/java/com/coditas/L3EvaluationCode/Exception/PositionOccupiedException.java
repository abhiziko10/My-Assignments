package com.coditas.L3EvaluationCode.Exception;

public class PositionOccupiedException extends RuntimeException{
    public PositionOccupiedException(){
        super("Position already occupied");
    }

}
