package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.services.BillingServices;
import com.trax.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingServices billService;
	@RequestMapping("/createBill")
public String createBill(@RequestParam("bid") long id,ModelMap model)
{
		Contact contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
}
	@RequestMapping("/saveBill")
	public String saveBill(Billing Bill,ModelMap model)
	{
		billService.saveBill(Bill);
		List<Billing> bill = billService.bill();
model.addAttribute("bill", bill);
		return "bill_list";
	}
}
