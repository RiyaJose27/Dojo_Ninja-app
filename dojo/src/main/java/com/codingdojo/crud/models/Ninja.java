package com.codingdojo.crud.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninja {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
	
   
   @NotNull
   @Size(min=5, max=150, message = "Need size to be 5 to 150")
   private String fname;
   
   
   @NotNull
   @Size(min=5, max=150, message = "Need size to be 5 to 150")
   private String lname;
   
   
   @NotNull
   @Min(value=5, message ="age is needed")
   private int age;
	 
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="dojo_id")
   private Dojo dojo;
   
   
   
   
   @Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
  
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;   
    
    
    
    public Ninja () {}



	




    
	public Ninja(@NotNull @Size(min = 5, max = 150, message = "Need size to be 5 to 150") String fname,
			@NotNull @Size(min = 5, max = 150, message = "Need size to be 5 to 150") String lname,
			@NotNull @Min(value = 5, message = "age is needed") int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}









	public Ninja(@NotNull @Size(min = 5, max = 150, message = "Need size to be 5 to 150") String fname,
			@NotNull @Size(min = 5, max = 150, message = "Need size to be 5 to 150") String lname,
			@NotNull @Min(value = 5, message = "age is needed") int age, Dojo dojo) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.dojo = dojo;
	}


 






	public Dojo getDojo() {
		return dojo;
	}









	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}









	public long getId() {
		return id;
	}









	public void setId(long id) {
		this.id = id;
	}









	public String getFname() {
		return fname;
	}









	public void setFname(String fname) {
		this.fname = fname;
	}









	public String getLname() {
		return lname;
	}









	public void setLname(String lname) {
		this.lname = lname;
	}









	public int getAge() {
		return age;
	}









	public void setAge(int age) {
		this.age = age;
	}









	public Date getCreatedAt() {
		return createdAt;
	}









	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}









	public Date getUpdatedAt() {
		return updatedAt;
	}









	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}









	//and getters removed for brevity
	   @PrePersist
	   protected void onCreate(){
	       this.createdAt = new Date();
	   }
	   @PreUpdate
	   protected void onUpdate(){
	       this.updatedAt = new Date();
	       
	       
	       
	   }
}
    