package org.sid.customerservice.entry;

import org.axonframework.eventhandling.annotation.EventHandler;
import org.sid.customerservice.event.CustomerCreatedEvent;
import org.sid.customerservice.repository.CustomerEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerEventListener {

    @Autowired
    private CustomerEntryRepository customerEntryRepository;

    @EventHandler
    public void handle(CustomerCreatedEvent event) {
        customerEntryRepository.save(new CustomerEntry(event.getName(), event.getEmail()));

    }

}
