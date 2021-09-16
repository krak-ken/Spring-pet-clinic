package course.project.pet_clinic_data.services;

import java.util.Set;

import course.project.pet_clinic_data.model.Vet;

public interface VetService {
    
    Vet findById(Long Id);
    
    Set<Vet> findAll();
    
    Vet save(Vet vet);

}
