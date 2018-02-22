package demo.controller.bar;

import javax.validation.constraints.Size;

import demo.validator.SomeCheck;
import lombok.Data;

@Data
public class RegistBarForm {

	@Size(max = 2)
    @SomeCheck
    private String barName;

}
