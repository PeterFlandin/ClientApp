package edu.datascientest.clientapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.datascientest.clientapp.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}