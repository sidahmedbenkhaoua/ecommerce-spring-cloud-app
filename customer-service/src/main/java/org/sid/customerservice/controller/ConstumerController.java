package org.sid.customerservice.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.sid.customerservice.command.CreateCustomerCommand;
import org.sid.customerservice.controller.request.CustomerRequest;
import org.sid.customerservice.repository.CustomerEntryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ConstumerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConstumerController.class);

    @Autowired
    private CommandGateway commandGateway;

    @Autowired
    CustomerEntryRepository customerEntryRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity createCustomer(@RequestBody @Valid CustomerRequest request) {
        LOGGER.info("request creat new costomer {}", request);

        commandGateway.send(
                new CreateCustomerCommand(request.getCustomerId(),
                        request.getName(),
                        request.getEmail()));

        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity greetingHello() {

        LOGGER.info("retrive all consumers");

        return ResponseEntity.ok()
                .body(customerEntryRepository.findAll());
    }
}
