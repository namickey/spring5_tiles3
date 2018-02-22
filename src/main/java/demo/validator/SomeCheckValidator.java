package demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class SomeCheckValidator implements ConstraintValidator<SomeCheck, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        if (StringUtils.isEmpty(value)) {
            return true;
        }

        if (value instanceof String && ((String) value).contains("a")) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("{0} contains a").addConstraintViolation();
            return false;
        }
        return true;
    }
}
