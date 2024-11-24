package pe.edu.cibertec.apprestventas.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apprestventas.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Transactional
    @Modifying
    @Query(value="UPDATE categories Set categoryname =:categoryname WHERE categoryid=:categoryid", nativeQuery=true)
    void actualizarNombreCategoria(@Param("categoryid") Integer categoryid, @Param("categoryname")  String categoryname);
}
