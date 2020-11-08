package org.sid.customerservice.repository;


import org.sid.customerservice.entry.CustomerEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CustomerEntryRepository extends JpaRepository<CustomerEntry, Long> {
}
