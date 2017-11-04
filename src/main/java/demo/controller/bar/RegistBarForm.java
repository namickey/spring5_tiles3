package demo.controller.bar;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Data
public class RegistBarForm {
    @Size(max = 2)
    private String barName;
}
