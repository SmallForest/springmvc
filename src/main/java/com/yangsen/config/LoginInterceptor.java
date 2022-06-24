package com.yangsen.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //return bool，true表示放行，false表示不放行
        System.out.println("========LoginInterceptor======");
        HttpSession session = request.getSession();
        if (session.getAttribute("SName") != null) {
            return true;
        }
        request.getRequestDispatcher("/loginPage").forward(request,response);
        return false;
    }
}
