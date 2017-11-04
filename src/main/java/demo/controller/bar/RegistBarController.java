package demo.controller.bar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistBarController {

    @RequestMapping(value = "/bar/regist/index", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("bar/regist/index");
        model.addAttribute("registBarForm", new RegistBarForm());
        return "bar/regist";
    }

    @RequestMapping(value = "/bar/regist/regist", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registBarForm")RegistBarForm registBarForm, BindingResult result){
        System.out.println("regist");
        if(result.hasErrors()){
            return "bar/regist";
        }
        System.out.println(registBarForm.getBarName());
        return "redirect:index";
    }
}
