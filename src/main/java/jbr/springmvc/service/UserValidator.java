package jbr.springmvc.service;

import jbr.springmvc.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    /*private final Validator userValidator;

    public UserValidator(Validator userValidator) {
        if(userValidator == null){
            throw new IllegalArgumentException("The supplied [Validator] is" +
                    "required and must not be null");
        }
        if (!userValidator.supports(User.class)) {
            throw new IllegalArgumentException("The supplied [Validator] must" +
                    "support the validation of [User] instances.");
        }
        this.userValidator = userValidator;
    }*/

    public boolean supports(Class candidate){
        return User.class.isAssignableFrom(candidate);
    }

    public void validate(Object obj, Errors errors){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required", "Field is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required", "Field is required.");

        /*User user = (User) obj;
        try{
            errors.pushNestedPath("");
            ValidationUtils.invokeValidator(this.userValidator, user.getUsername(), errors);
        } finally {
            errors.popNestedPath();
        }*/
    }
}
