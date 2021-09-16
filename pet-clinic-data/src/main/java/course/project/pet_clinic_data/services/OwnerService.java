package course.project.pet_clinic_data.services;

import java.util.Set;

import course.project.pet_clinic_data.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);
    
    Owner findById(Long Id);
    
    Set<Owner> findAll();
    
    Owner save(Owner owner);
}
