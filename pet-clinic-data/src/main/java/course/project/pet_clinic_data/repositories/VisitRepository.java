package course.project.pet_clinic_data.repositories;

import course.project.pet_clinic_data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
