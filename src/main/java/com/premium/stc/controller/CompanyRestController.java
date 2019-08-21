package com.premium.stc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.premium.stc.model.Company;
import com.premium.stc.service.CompanyService;

@RestController
public class CompanyRestController {

	@Autowired
	CompanyService companyService;
	
	@GetMapping("/companieslist/{sectorName}")
	public List<Company> getCompaniesList(@PathVariable String sectorName) throws Exception
	{
		
		return companyService.getCompanyListSector(sectorName);
		
	}
	@GetMapping("/matchingcompanies/{pattern}")
	public List<String> companyPatternMatching(@PathVariable("pattern") String pattern) throws Exception
	{
		
			return companyService.getPattern(pattern);
		
	}
}
