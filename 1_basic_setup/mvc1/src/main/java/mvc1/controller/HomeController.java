package mvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home")
	public String home()
	{
		System.out.println("Home Function");
		return "index";
	}
	
	@RequestMapping(value="/about")
	public String about()
	{
		System.out.println("about-controller");
		return "about";
	}
}
