package com.graymatter.entities;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.domain.Persistable;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project22Person")
public class Person implements Persistable<Long> {
	@Id 
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aAdharNum;
	@Column(name="personName")
	@Size(min=3,message="Person name must be more than 3 chars length")
	private String name;
	@NotBlank
	@Pattern(regexp="[6789][0-9]{9}",message="mobile number must be of 10 length,starting with either 6,7,8,9")
	private String mobileNum;
	@Range(min=18,message="minimum age is 18 to caste vote")
	private int age;
	private String email;
	
	@Transient
	@Builder.Default
	private boolean isNewId=true;
	
	@Override
	public Long getId() {
		return null;
	}
	
	private static boolean $default$isNewId() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNew() {
		return isNewId;
	}
}
