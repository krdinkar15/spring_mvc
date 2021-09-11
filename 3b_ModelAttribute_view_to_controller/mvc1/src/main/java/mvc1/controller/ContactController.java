package mvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc1.controller.entity.User;

@Controller
public class ContactController {
	
	// This will be called before handler method
	@ModelAttribute
	public void commonDataForModel(Model model)
	{
		model.addAttribute("Header","Hello User");
		model.addAttribute("Desc","This is User Page");
		System.out.println("common attribute");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("showing form");
		return "contact";
	}
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user)
	{
		
		System.out.println(user);
		return "success";
	}
}

/*
@RequestMapping(path="processform",method=RequestMethod.POST)
public String handleForfm(@RequestParam("email") String userEmail,
		@RequestParam("username") String userName,
		@RequestParam("userpassword") String userPassword,Model model)
{
	User user=new User();
	user.setEmail(userEmail);
	user.setUsername(userName);
	user.setUserpassword(userPassword);
	System.out.println(user);
	model.addAttribute("user",user);
	return "success";
}
*/