package com.spring.sgppetclinic.services;

import com.spring.sgppetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
