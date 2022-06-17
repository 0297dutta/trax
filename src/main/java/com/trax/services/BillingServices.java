package com.trax.services;

import java.util.List;

import com.trax.entities.Billing;

public interface BillingServices {
	public void saveBill(Billing Bill);
	public List<Billing> bill();

}
