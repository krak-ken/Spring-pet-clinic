package course.project.pet_clinic_data.services;

import java.util.List;

import course.project.pet_clinic_data.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
