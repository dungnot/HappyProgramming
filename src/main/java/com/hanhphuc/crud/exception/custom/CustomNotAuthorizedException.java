package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomNotAuthorizedException extends BaseCustomException {

    public CustomNotAuthorizedException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
