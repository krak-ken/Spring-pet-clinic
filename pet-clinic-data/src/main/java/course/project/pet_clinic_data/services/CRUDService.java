package course.project.pet_clinic_data.services;

import java.util.Set;

public interface CRUDService<T, ID> {
    
    T findById(ID Id);
    
    Set<T> findAll();
    
    T save(T object);

    void deleteById(ID Id);
    
    void delete(T object);
}
