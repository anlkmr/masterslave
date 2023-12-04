package com.emagia.master.controller;

import com.emagia.master.Domain.MasterSlave;
import com.emagia.master.Repository.MasterSlaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("MasterSlave")
@RequestMapping("/ms/api/v2")
public class MasterSlaveController {
	
	@Autowired
	MasterSlaveRepository masterSlaveRepository;
	
	
	@GetMapping(value="/masterSlaveData")  
	public MasterSlave masterSlaveData(@RequestParam(value = "tenantName", required = true) String tenantName,
			@RequestParam(value = "envType", required = true) String envType,
			@RequestParam(value = "app", required = true) String app)
	{
		
		MasterSlave masterSlaveList=masterSlaveRepository.findByTenantAndEnvAndApp(tenantName,envType,app);
		return masterSlaveList;
		
	}

	@GetMapping(value="/testHome")
	public String testHome(	){
		return "Welcome to the master server in the master server environment directory";
	}

}
