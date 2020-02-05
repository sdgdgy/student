package com.ljh.interceptor;

import com.ljh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminInterceptor implements HandlerInterceptor {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("toLogin")) {
            return true;
        }
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        if (request.getRequestURI().contains("toStudentPage")) {
            return true;
        }
        if (request.getRequestURI().contains("toPersonalInformation_student")) {
            return true;
        }
        if (request.getRequestURI().contains("toUpdatePassword_student")) {
            return true;
        }
        if (request.getRequestURI().contains("updatePassword_student")) {
            return true;
        }
        if (request.getRequestURI().contains("logout")) {
            return true;
        }
        if(userService.queryUserById(request.getSession().getAttribute("username").toString()).get(0).getIdentity()==1){
            return true;
        }else{
            return false;
        }
    }
}
