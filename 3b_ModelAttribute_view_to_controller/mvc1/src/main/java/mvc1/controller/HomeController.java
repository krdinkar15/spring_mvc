package mvc1.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path = "/home", method=RequestMethod.POST)
	public String home(Model model)
	{
		System.out.println("Home Function");
		model.addAttribute("name","Kamal Raj Dinkar");
		model.addAttribute("Empid",123456);
		List<String> friends=new ArrayList<String>();
		friends.add("Nitish");
		friends.add("Amit");
		friends.add("Keval");
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping(value="/about")
	public String about()
	{
		System.out.println("about-controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Help called");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","KRD");
		modelAndView.addObject("Roll",1);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(13);
		lst.add(14);
		modelAndView.addObject("marks",lst);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
