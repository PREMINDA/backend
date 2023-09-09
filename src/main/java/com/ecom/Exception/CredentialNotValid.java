package com.ecom.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)

public class CredentialNotValid extends RuntimeException{
    public CredentialNotValid(String message) {
        super(message);
    }
}
