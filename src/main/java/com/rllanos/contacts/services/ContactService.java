package com.rllanos.contacts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rllanos.contacts.dao.ContactRepository;
import com.rllanos.contacts.dto.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository dao;
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
	

}
