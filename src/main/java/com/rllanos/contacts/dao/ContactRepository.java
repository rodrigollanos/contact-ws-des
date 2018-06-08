package com.rllanos.contacts.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rllanos.contacts.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{





}
