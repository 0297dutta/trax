package com.trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Lead;
import com.trax.repositories.LeadRepository;
@Service
public class LeadServiceimpl implements LeadService {
@Autowired
private LeadRepository leadRepo;

	@Override
	public void saveLeadInfo(Lead lead) {
leadRepo.save(lead);
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
        return lead;    	
	}

	@Override
	public void deleteByLeadId(long id) {
		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {
List<Lead> findAll = leadRepo.findAll();

		return findAll;
	}
	

}
