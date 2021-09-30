package course.project.pet_clinic_data.repositories;

import course.project.pet_clinic_data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
