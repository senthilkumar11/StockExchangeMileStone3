package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.model.IPOPlaned;
import com.premium.stc.service.IPOservice;

@RestController
public class IPORestController {
	@Autowired
	IPOservice ipoService;
	@GetMapping("/ipodetails/{companyname}")
	public IPOPlaned getIPODetailsByCompany(@PathVariable("companyname") String companyName) throws Exception
	{
		
		return ipoService.getIPOBycompanyName(companyName);
		
	}
}
