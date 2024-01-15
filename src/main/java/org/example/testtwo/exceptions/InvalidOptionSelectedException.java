package org.example.testtwo.exceptions;

public class InvalidOptionSelectedException extends RuntimeException{

    public InvalidOptionSelectedException(String errorMsg){
        super(errorMsg);
    }

}
