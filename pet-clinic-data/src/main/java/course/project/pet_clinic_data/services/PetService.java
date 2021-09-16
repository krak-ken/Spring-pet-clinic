package course.project.pet_clinic_data.services;

import java.util.Set;

import course.project.pet_clinic_data.model.Pet;

public interface PetService {

    Pet findById(Long Id);
    
    Set<Pet> findAll();
    
    Pet save(Pet pet);
    
}
