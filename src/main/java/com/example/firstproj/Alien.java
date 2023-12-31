package com.example.firstproj;
//hello
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public int getAid() {
		return aid;
	}
	
	
	public Alien() {
		super();
		System.out.println("object");
	}


	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("hello");
		laptop.compile();
	}
	
	

}
