package com.waylau.spring.boot.thymeleaf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class User {
	//唯一标识
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;

	//构造器,防止直接使用
    protected User(){

    }

    //带参数的构造函数
    public User(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("User[id=%d,name='%s',email='%s']", id,name,email);
    }
}
