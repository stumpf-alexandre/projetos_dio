import React from 'react';
import { Controller } from "react-hook-form";
import { 
    IconContainer, 
    InputContainer, 
    InputText, 
} from './style';

const Input = ({leftIcon, name, control, ...rest}) => {
    return (
        <InputContainer>
            {leftIcon ? (<IconContainer>{leftIcon}</IconContainer>) : null}
            <Controller 
                name={name}
                control={control}
                render={({ field }) => <InputText {...field} {...rest} />}
            />
        </InputContainer>
    )
}

export { Input };