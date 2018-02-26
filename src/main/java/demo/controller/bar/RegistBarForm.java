package demo.controller.bar;

import javax.validation.constraints.Size;

import demo.format.StringFormat;
import demo.validator.SomeCheck;

public class RegistBarForm {


	@Size(max = 2)
    @SomeCheck
    private String _barName;


    public String getBarName() {
        System.out.println("RegistBarForm:getBarName:" + _barName);
        return _barName;
    }

    @StringFormat
    public void setBarName(String barName) {
        System.out.println("RegistBarForm:setBarName:" + barName);
        this._barName = barName;
    }

}
