package com.emagia.master.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EX_CONFIG",schema = "EXCHANGEPROD")
public class MasterSlave {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SN")
    private Long sn;
	
	
	@Column(name="TENANT") 
	private String tenant;
	
	@Column(name="ENV")
	private String env;
	
	@Column(name="APP")
	private String app;
	
	
	@Column(name="SERVICE")
	private String service;
	
	@Column(name="CONFIG")
	private String config;
	
	@Column(name="HOTKEY")
	private String hotkey;

	@Column(name="ENCR_SALT")
	private String encrSalt;
	
	@Column(name="WHITELISTEDIPS")
	private String whiteListedIps;
	
	@Column(name="ENCRYPTED_CONFIG")
	private String encryptedConfig;

	public Long getSn() {
		return sn;
	}

	public void setSn(Long sn) {
		this.sn = sn;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getHotkey() {
		return hotkey;
	}

	public void setHotkey(String hotkey) {
		this.hotkey = hotkey;
	}

	public String getEncrSalt() {
		return encrSalt;
	}

	public void setEncrSalt(String encrSalt) {
		this.encrSalt = encrSalt;
	}

	public String getWhiteListedIps() {
		return whiteListedIps;
	}

	public void setWhiteListedIps(String whiteListedIps) {
		this.whiteListedIps = whiteListedIps;
	}

	public String getEncryptedConfig() {
		return encryptedConfig;
	}

	public void setEncryptedConfig(String encryptedConfig) {
		this.encryptedConfig = encryptedConfig;
	}

	@Override
	public String toString() {
		return "MasterSlave [sn=" + sn + ", tenant=" + tenant + ", env=" + env + ", app=" + app + ", service=" + service
				+ ", config=" + config + ", hotkey=" + hotkey + ", encrSalt=" + encrSalt + ", whiteListedIps="
				+ whiteListedIps + ", encryptedConfig=" + encryptedConfig + "]";
	}

	
	
}
