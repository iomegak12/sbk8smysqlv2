package com.intsol.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intsol.practice.model.Pet;

public interface PetRepository extends JpaRepository<Pet, String> {

}
