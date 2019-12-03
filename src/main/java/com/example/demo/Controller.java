package com.example.demo;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/getRevString/{someString}")
    public Model greeting(@PathVariable String someString) {
        Model response = new Model();
        response.revString = new StringBuilder(someString).reverse().toString();
        return response;
    }
}
