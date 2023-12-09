package br.com.chrony.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = -5439118687584375048L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(final Date timestamp, final String message, final String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
