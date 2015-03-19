package de.nh.addressBook.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView mainSeite(@RequestParam(defaultValue = "0") String error, HttpServletRequest request) {

		Object userid = request.getSession().getAttribute("userid");
		Map<String, Object> viewMap = new HashMap<>();
		viewMap.put("user", userid);
		viewMap.put("error", error);

		return new ModelAndView("index", viewMap);
	}

	

}
