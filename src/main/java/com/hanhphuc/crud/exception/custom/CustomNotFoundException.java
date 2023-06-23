package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomNotFoundException extends BaseCustomException {

    public CustomNotFoundException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
