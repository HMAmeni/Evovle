package com.evolve.core.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evolve.core.domain.entities.Candidate;
import com.evolve.core.domain.repositories.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	CandidateRepository candidateRepository;

	public void saveCandidate(Candidate candidate) {
		candidateRepository.save(candidate);
	}

	public void deleteCandidate(Candidate candidate) {
		candidateRepository.delete(candidate);	
	}
	public List<Candidate> getAllCandidates(){
		return candidateRepository.findAll();	
	}
	
	public Optional<Candidate> getCandidateById(int idCandidate) {
		return candidateRepository.findById(idCandidate);
	}
}
