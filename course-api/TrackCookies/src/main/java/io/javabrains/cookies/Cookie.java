package io.javabrains.cookies;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cookie {
	@Id
	private String name;
	private String value;
	private String userid;
	private String companyid;
	private String expirydate;
	private int size;
	private boolean http;
	private boolean secure;
	private boolean sameparty;
	private boolean samesite;
	private int priority;
	
	public Cookie() {
		
	}
	
	public Cookie(String name, String value, String userid, String companyid, String expirydate, int size, boolean http,
			boolean secure, boolean sameparty, boolean samesite, int priority) {
		super();
		this.name = name;
		this.value = value;
		this.userid = userid;
		this.companyid = companyid;
		this.expirydate = expirydate;
		this.size = size;
		this.http = http;
		this.secure = secure;
		this.sameparty = sameparty;
		this.samesite = samesite;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isHttp() {
		return http;
	}
	public void setHttp(boolean http) {
		this.http = http;
	}
	public boolean isSecure() {
		return secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public boolean isSameparty() {
		return sameparty;
	}
	public void setSameparty(boolean sameparty) {
		this.sameparty = sameparty;
	}
	public boolean isSamesite() {
		return samesite;
	}
	public void setSamesite(boolean samesite) {
		this.samesite = samesite;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
	
}