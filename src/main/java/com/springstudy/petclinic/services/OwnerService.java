package com.springstudy.petclinic.services;

import com.springstudy.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
