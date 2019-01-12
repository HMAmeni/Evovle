package com.evolve.core.domain.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idCandidate;

	private String candidateName;
	private String candidateEmail;

	private int age;

	public int getIdCandidate() {
		return idCandidate;
	}

	public void setIdCandidate(int idCandidate) {
		this.idCandidate = idCandidate;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	


}
