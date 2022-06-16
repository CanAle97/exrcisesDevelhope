package it.develhope.dependencyInjection.components;

import org.springframework.stereotype.Component;

/**
 *define a component called `MyComponent` where you have:
 *  an instance string variable called `myComponentName`
 *  a constructor that assigns your name to the instance variable
 *  a method `getMyComponentName()` that returns the value of `myComponentImmutableName`
 *
 * @author Alessandro Canulli
 */

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor was called");
        this.myComponentName = "Alessandro Canulli";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() was called");
        return myComponentName;
    }
}