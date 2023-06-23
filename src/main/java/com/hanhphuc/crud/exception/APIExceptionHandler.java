package com.hanhphuc.crud.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hanhphuc.crud.exception.custom.CustomBadRequestException;
import com.hanhphuc.crud.exception.custom.CustomDuplicateFieldException;
import com.hanhphuc.crud.exception.custom.CustomForbiddenException;
import com.hanhphuc.crud.exception.custom.CustomInternalServerException;
import com.hanhphuc.crud.exception.custom.CustomNotAuthorizedException;
import com.hanhphuc.crud.exception.custom.CustomNotFoundException;
import com.hanhphuc.crud.model.CustomError;

@RestControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler(CustomBadRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String, CustomError> badRequestException(CustomBadRequestException ex) {
        return ex.getErrors();
    }

    @ExceptionHandler(CustomNotAuthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Map<String, CustomError> notAuthorizedException(CustomNotAuthorizedException ex) {
        return ex.getErrors();
    }

    @ExceptionHandler(CustomDuplicateFieldException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Map<String, CustomError> duplicateFieldException(CustomDuplicateFieldException ex) {
        return ex.getErrors();
    }

    @ExceptionHandler(CustomForbiddenException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Map<String, CustomError> forbiddenException(CustomForbiddenException ex) {
        return ex.getErrors();
    }

    @ExceptionHandler(CustomInternalServerException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Map<String, CustomError> internalServerException(CustomInternalServerException ex) {
        return ex.getErrors();
    }

    @ExceptionHandler(CustomNotFoundException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public Map<String, CustomError> notFoundException(CustomNotFoundException ex) {
        return ex.getErrors();
    }
}
