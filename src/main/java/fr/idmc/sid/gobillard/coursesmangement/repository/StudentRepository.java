package fr.idmc.sid.gobillard.coursesmangement.repository;

import fr.idmc.sid.gobillard.coursesmangement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
