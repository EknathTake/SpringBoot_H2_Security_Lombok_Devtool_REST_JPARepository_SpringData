package com.ekspract.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_student")
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2179099447424157476L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long id;

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private String passportNumber;

	/*
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getPassportNumber() { return passportNumber; }
	 * 
	 * public void setPassportNumber(String passportNumber) { this.passportNumber =
	 * passportNumber; }
	 * 
	 * @Override public String toString() { StringBuilder builder = new
	 * StringBuilder(); builder.append("Student [id="); builder.append(id);
	 * builder.append(", name="); builder.append(name);
	 * builder.append(", passportNumber="); builder.append(passportNumber);
	 * builder.append("]"); return builder.toString(); }
	 */

}