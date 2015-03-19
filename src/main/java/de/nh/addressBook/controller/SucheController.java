package de.nh.addressBook.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.nh.addressBook.model.User;
import de.nh.addressBook.service.SuchenService;

@Controller
public class SucheController {
	
	@Autowired
	SuchenService suchenService;

	
	@RequestMapping(value = "/suchen", method = RequestMethod.GET)
	public ModelAndView adresseSuchen(@RequestParam(defaultValue = "0") String error, HttpServletRequest request) {

		Map<String, Object> viewMap = new HashMap<>();
	

		return new ModelAndView("suchen", viewMap);
	}
	

	@RequestMapping(value = "/ergebnis", method = RequestMethod.GET)
	public ModelAndView adresseSpeichern(@RequestParam String name, @RequestParam String vorname, @RequestParam String strasse,
			@RequestParam String plz, @RequestParam String ort, @RequestParam String telefon, HttpServletRequest request, 
			HttpServletResponse response ) throws IOException {


		List<User> adressen = suchenService.adresseSuchen(name, vorname, strasse,plz, ort, telefon);

		Map<String, Object> viewMap = new HashMap<>();
		viewMap.put("adressen", adressen);
		
		return new ModelAndView("ergebnis", viewMap);
	
	
	}
}
