package br.com.luca5dev.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
}
