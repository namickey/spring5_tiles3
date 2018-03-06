package demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import demo.controller.base.BaseController;

public class LogInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("*********************");
        HandlerMethod method = (HandlerMethod) handler;
        BaseController cont = (BaseController)method.getBean();
        System.out.println("preHandle:" + cont.check(request));
        return true;
    }
}
