package com.emagia.master.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emagia.master.Domain.MasterSlave;


@Repository
public interface MasterSlaveRepository  extends JpaRepository<MasterSlave,String>{

	MasterSlave findByTenantAndEnvAndApp(String tenantName, String envType, String app);
	
}