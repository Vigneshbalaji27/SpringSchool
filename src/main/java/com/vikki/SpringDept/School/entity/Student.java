package com.vikki.SpringDept.School.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
		private String studName;
	    private String studAddress;
	    private String studDept;
	    
	    public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getStudName() {
			return studName;
		}
		public void setStudName(String studName) {
			this.studName = studName;
		}
		public String getStudAddress() {
			return studAddress;
		}
		public void setStudAddress(String studAddress) {
			this.studAddress = studAddress;
		}
		public String getStudDept() {
			return studDept;
		}
		public void setStudDept(String studDept) {
			this.studDept = studDept;
		}
		
	    
	    
}
