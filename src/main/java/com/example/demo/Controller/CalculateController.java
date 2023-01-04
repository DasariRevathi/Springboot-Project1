package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {
    @GetMapping("/addition/{firstNum}/{SecondNum}")
    public double add(@PathVariable("firstNum") double firstNumber,
                      @PathVariable("SecondNum") double SecondNumber){
        return firstNumber+SecondNumber;

    }
    @GetMapping("/subtraction/{firstNum}/{SecondNum}")
    public double subtract(@PathVariable("firstNum") double firstNumber,
                      @PathVariable("SecondNum") double SecondNumber){
        return firstNumber-SecondNumber;

    }
    @GetMapping("/Multiplication/{firstNum}/{SecondNum}")
    public double multiply(@PathVariable("firstNum") double firstNumber,
                      @PathVariable("SecondNum") double SecondNumber){
        return firstNumber*SecondNumber;

    }
    @GetMapping("/division/{firstNum}/{SecondNum}")
    public double divide(@PathVariable("firstNum") double firstNumber,
                      @PathVariable("SecondNum") double SecondNumber){
        if(SecondNumber!=0)
        return firstNumber/SecondNumber;
        else
            return 1;

    }
}
