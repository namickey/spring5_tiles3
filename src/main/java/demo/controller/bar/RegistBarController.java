package demo.controller.bar;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistBarController {

    @RequestMapping(value = "/bar/regist/index", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("RegistBarController:index:start");
        model.addAttribute("registBarForm", new RegistBarForm());
        System.out.println("RegistBarController:index:end");
        return "bar/regist";
    }

    @RequestMapping(value = "/bar/regist/regist", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registBarForm")RegistBarForm registBarForm, BindingResult result){
        System.out.println("●RegistBarController:regist:start");
        if(result.hasErrors()){
            System.out.println(registBarForm.getBarName());
            System.out.println("RegistBarController:regist:end");
            return "bar/regist";
        }
        System.out.println(registBarForm.getBarName());
        System.out.println("RegistBarController:regist:end");
        return "redirect:index";
    }
}
