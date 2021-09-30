package course.project.pet_clinic_data.repositories;

import course.project.pet_clinic_data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
