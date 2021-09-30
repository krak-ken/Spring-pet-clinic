package course.project.pet_clinic_data.repositories;

import course.project.pet_clinic_data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
