package com.ecge.erp.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
		@Autowired
	ServletContext servletContext;

	@GetMapping("/")
	public String home() {
		System.out.println("Inside Home Controller");
		return "index";
	}

	@GetMapping("/withsm")
	public String homeWithSM() {
		System.out.println("Inside Home Controller With SM");
		return "homeWithSM";
	}

	@GetMapping("/indexwithsm")
	public String indexpage() {
		System.out.println("Inside Home Controller index With SM");
		return "index";
	}

	@GetMapping("/secure")
	public String secureHome() {
		System.out.println("Inside secure Home Controller");
		return "securehome";
	}

	@GetMapping("/datatablewithsm")
	public String datatables() {
		System.out.println("Inside Home Controller With SM datatable");
		return "datatable";
	}

	@GetMapping("/buttonswithsm")
	public String buttons() {
		System.out.println("Inside Home Controller With SM buttons");
		return "buttons";
	}

	@GetMapping("/formelementswithsm")
	public String formelements() {
		System.out.println("Inside Home Controller With SM formelements");
		return "formelements";
	}

	@GetMapping("/deatailedtableswithsm")
	public String detailtable() {
		System.out.println("Inside Home Controller With SM detaileddatatable");
		return "detailedtable";
	}

	@GetMapping("/userprofilewithsm")
	public String userprofile() {
		System.out.println("Inside Home Controller With SM userprofile");
		return "userprofile";
	}

	@GetMapping("/exporter_profilewithsm")
	public String exporterprofile() {
		System.out.println("Inside Home Controller With SM exporterprofile");
		return "exporter_profile";
	}

	@GetMapping("/employee_profilewithsm")
	public String employeeprofile() {
		System.out.println("Inside Home Controller With SM exporterprofile");
		return "employeeprofile";
	}

	@GetMapping("/alertwithsm")
	public String alert() {
		System.out.println("Inside Home Controller With SM alert");
		return "alert";
	}

	@GetMapping("/loaderwithsm")
	public String loader() {
		System.out.println("Inside Home Controller With SM loader");
		return "loader";
	}

	@GetMapping("/multistepperwithsm")
	public String multistepform() {
		System.out.println("Inside Home Controller With SM multistepform");
		return "multisteper";
	}

	@GetMapping("/tabletojsonwithsm")
	public String tabletojson() {
		System.out.println("Inside Home Controller With SM table to json");
		return "tabletojson";
	}

	@GetMapping("/dashboardwithsm")
	public String dashboard() {
		System.out.println("Inside Home Controller With SM dashboard");
		return "dashboard";
	}

	}
