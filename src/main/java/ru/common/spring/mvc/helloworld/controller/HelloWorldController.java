package ru.common.spring.mvc.helloworld.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.common.spring.mvc.helloworld.model.MvcHelloWorldModel;

@Controller
public class HelloWorldController {

	public HelloWorldController(){
		System.out.println("HelloWorldController started");
	}

	@RequestMapping("/helloworld")
	public String handler(Model model) {

		MvcHelloWorldModel helloWorld = new MvcHelloWorldModel();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld);
		return "helloworld";
	}
}
