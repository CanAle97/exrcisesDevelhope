package co.develhope.interceptorsMiddleware1.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;

@Component
public class APILoggingInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LocalTime startTime = LocalTime.now();
        System.out.println("Request URL::" + request.getRequestURL().toString() + ":: Start Time = " + startTime);
        return true;
    }
}