package course.project.pet_clinic_data.repositories;

import course.project.pet_clinic_data.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
