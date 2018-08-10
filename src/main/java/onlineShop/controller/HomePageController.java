package onlineShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String returHomePage() {
		return "index";
	}

	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String returnAboutUs() {
		return "aboutUs";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
							@RequestParam(value = "logout", required = false) String logout){
		ModelAndView mv = new ModelAndView();
		if(error !=null) {
			mv.addObject("error", "Invalid username or passward");
		}
		if(logout!=null) {
			mv.addObject("logout","You have logged out succesfully");
		}
		mv.setViewName("login");
		return mv;
	}

}
