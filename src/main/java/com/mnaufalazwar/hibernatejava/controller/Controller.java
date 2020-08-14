package com.mnaufalazwar.hibernatejava.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mnaufalazwar.hibernatejava.entity.Mahasiswa;
import com.mnaufalazwar.hibernatejava.service.MahasiswaService;
import com.mnaufalazwar.hibernatejava.service.impl.MahasiswaServiceImpl;
import com.mnaufalazwar.hibernatejava.util.HibernateUtil;

@RestController
@RequestMapping(value="/con")
public class Controller {
	
	private MahasiswaService mahasiswaService = new MahasiswaServiceImpl(HibernateUtil.getMahasiswaDao());

	@RequestMapping(value="/insert", method=RequestMethod.PUT)
	public String insertMahasiswa(@RequestBody Mahasiswa mahasiswa) {
		
		if(mahasiswaService.insert(mahasiswa)) {
			return "insert success";
		}
		else {
			return "insert failsed";
		}
		
//		return "insert failsed";
		
	}
	
}
