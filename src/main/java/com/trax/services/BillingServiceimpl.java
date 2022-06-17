package com.trax.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.repositories.BillingRepository;
@Service
public class BillingServiceimpl implements BillingServices {
@Autowired
BillingRepository billingRepo;
	@Override
	public void saveBill(Billing Bill) {
billingRepo.save(Bill);
	}
	@Override
	public List<Billing> bill() {
List<Billing> list = billingRepo.findAll();
return list;
	
	}

}
