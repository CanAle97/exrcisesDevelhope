package co.develhope.interceptorsMiddleware2.interceptors;

import co.develhope.interceptorsMiddleware2.entities.Month;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public static List<Month> months = new ArrayList<>(Arrays.asList(
            new Month(1, "January", "Gennaio", "Januar"),
            new Month(3, "March", "Marzo", "Marsch"),
            new Month(5, "May", "Maggio", "Kann"),
            new Month(7, "July", "Luglio", "Juli"),
            new Month(9, "September", "Settembre", "September"),
            new Month(11, "November", "Novembre", "November")
    ));

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberString = request.getHeader("monthNumber");
        if(monthNumberString == null || monthNumberString.isEmpty()){
            response.setStatus(400);
            return true;
        }
        Integer monthNumber = Integer.parseInt(monthNumberString);
        Optional<Month> month = months.stream().filter(singleMonth->{
            return singleMonth.getMonthNumber() == monthNumber;
        }).findFirst();

        if(month.isPresent()) {
            request.setAttribute("MonthInterceptor-month", month.get());
        } else {
            Month month1 = new Month(monthNumber, "nope", "nope", "nope");
            request.setAttribute("MonthInterceptor-month", month1);
            response.setStatus(200);
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}