package mvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}

	//  Old
	//	@RequestMapping(path="processform",method=RequestMethod.POST)
	//	public String handleForm(HttpServletRequest request)
	//	{
	//		String email=request.getParameter("email");
	//		System.out.println("User Email is "+email);
	//		return "";
	//	}
	
	@RequestMapping(path="processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("userpassword") String userPassword,Model model)
	{
		System.out.println(userEmail+ " "+userName+" "+userPassword);
		model.addAttribute("Name",userName);
		model.addAttribute("Email",userEmail);
		model.addAttribute("Password",userPassword);
		return "success";
	}
}
