package com.doctorapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@RequestMapping("admin")
	public String admin(Model model) {
		
		return "adminlogin";   // jsp file
	}
	
	@RequestMapping("login")
	public String login(@RequestParam("username") String username,
						@RequestParam("password") String password) {
		if(username.equals("admin") && password.equals("admin")) {
			return "adminDash";
		}
		
		return "adminlogin";
	}
	
	@RequestMapping("add-doctor-form")
	public String addDoctor(Model model) {
		return "addDoctorForm";
	}
	
	@RequestMapping("edit-doctor-form")
	public String editDoctor(Model model) {
		return "editDoctorForm";
	}
	
	@RequestMapping("delete-doctor-form")
	public String deleteDoctor(Model model) {
		return "deleteDoctorForm";
	}

}
