package com.org;

import com.org1.DBConfig;

public class JpaImpl {
private DBConfig dbConfig ;
	
	
	public JpaImpl(DBConfig dbconfig) {
		this.dbConfig = dbconfig;
	}
	
	public JpaImpl() {
		
	}
	
	public void store() {
		System.out.println("store() implementation done via JPA ");
		System.out.println("DB Config: Url = "+dbConfig.getDbUrl()+", Name = "+dbConfig.getDbname());
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

}
