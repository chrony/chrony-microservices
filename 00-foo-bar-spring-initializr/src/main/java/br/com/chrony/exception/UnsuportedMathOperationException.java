package br.com.chrony.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException {

    private static final long serialVersionUID = -5880218725045550039L;

    public UnsuportedMathOperationException(String exception) {
        super(exception);
    }
}
