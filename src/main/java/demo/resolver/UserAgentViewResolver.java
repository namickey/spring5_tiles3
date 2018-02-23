package demo.resolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

public class UserAgentViewResolver extends ContentNegotiatingViewResolver {

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {

        System.out.println("viewName:" + viewName);

        return super.resolveViewName(viewName, locale);
    }

}
