package pe.edu.cibertec.apprestventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apprestventas.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
