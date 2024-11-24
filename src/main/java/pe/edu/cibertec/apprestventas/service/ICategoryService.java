package pe.edu.cibertec.apprestventas.service;

import pe.edu.cibertec.apprestventas.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
    Optional<Category> findById(Integer id);
    void save(Category category);
    void delete(int id);
}
