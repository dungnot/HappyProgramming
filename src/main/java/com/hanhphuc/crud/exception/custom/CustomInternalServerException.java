package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomInternalServerException extends BaseCustomException {

    public CustomInternalServerException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
