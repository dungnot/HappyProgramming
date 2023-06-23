package com.hanhphuc.crud.exception.custom;

import com.hanhphuc.crud.model.CustomError;

public class CustomDuplicateFieldException extends BaseCustomException {

    public CustomDuplicateFieldException(CustomError error) {
        super(error);
        // TODO Auto-generated constructor stub
    }

}
