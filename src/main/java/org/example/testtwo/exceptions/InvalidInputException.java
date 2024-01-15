package org.example.testtwo.exceptions;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(String errorMsg){
        super(errorMsg);
    }

}
