package co.develhope.interceptorsMiddleware2.controllers;

import co.develhope.interceptorsMiddleware2.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("")
    public Month getMonth(HttpServletRequest request) {
        Month month = (Month) request.getAttribute("MonthInterceptor-month");
        return month;
    }
}