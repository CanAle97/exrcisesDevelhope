package it.develhope.dependencyInjection.services;

import it.develhope.dependencyInjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *define a service called `MyService` where you have:
 *  a private variable `MyComponent`
 *  a constructor where you apply constructor-based dependency injection
 *  a method `getName()` that calls and returns `getMyComponentName()`
 *
 * @author Alessandro Canulli
 */

@Service
public class MyService {
    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        System.out.println("MyService constructor was called");
        this.myComponent = myComponent;
    }

    public String getName() {
        System.out.println("MyService.getName() was called");
        return myComponent.getMyComponentName();
    }
}