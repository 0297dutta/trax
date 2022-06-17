package com.trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Contact;
import com.trax.repositories.ContactRepository;

@Service
public class ContactServiceimpl implements ContactService {
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public List<Contact> getAllContacts() {
List<Contact> findAll = contactRepository.findAll();
		
		return findAll;
	}

	@Override
	public Contact findContactById(long id) {
		Optional<Contact> findById = contactRepository.findById(id);
		Contact contact = findById.get();
		return contact;
		
	}

}
