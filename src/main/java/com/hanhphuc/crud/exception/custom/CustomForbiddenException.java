package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomForbiddenException extends BaseCustomException {

    public CustomForbiddenException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
