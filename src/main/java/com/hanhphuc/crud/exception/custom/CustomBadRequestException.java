package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomBadRequestException extends BaseCustomException {

    public CustomBadRequestException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
