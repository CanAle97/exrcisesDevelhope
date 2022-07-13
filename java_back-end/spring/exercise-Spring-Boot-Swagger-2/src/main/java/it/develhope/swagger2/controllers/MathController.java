package it.develhope.swagger2.controllers;

import io.swagger.annotations.ApiParam;
import it.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.*;

/**
 *Provide a controller called `MathController` from the mapping `/math` where you describe:
 *  `mapping=""`: `welcomeMathMsg()`
 *  `mapping="division-info"`: that returns a new `ArithmeticOperation` with all the details about the division
 *  `mapping="multiplication"`: that takes to int parameters and returns the multiplication value
 *  `mapping=square/{n}`: that returns the square of the `n`
 *
 * @author Alessandro Canulli
 */

@RestController
@RequestMapping("/math")
public class MathController implements WelcomeMsg  {
    private String sTry = "Try with '/square/'number'' or '/swagger-ui'";

    @Override
    @GetMapping(value = "")
    public String getsWelcome() {
        return sWelcome + sTry;
    }

    @GetMapping(value = "/division-info")
    public ArithmeticOperation divisionInfo(){
        return new ArithmeticOperation(
                "Division",
                0,
                "Basic division arithmetic operation",
                new String[]{"Division by 1", "Division by 0", "Division by itself", "Division of 0 by any number"}
        );
    }

    @GetMapping(value = "/multiplication")
    public int multiplication(@ApiParam(value = "The first number") int number1,
                                 @ApiParam(value = "The second number") int number2) {
        return number1 * number2;
    }

    @GetMapping(value = "/square/{n}")
    public int square(@ApiParam(value = "Enter the number here") @PathVariable() int n) {
        return n * n;
    }
}