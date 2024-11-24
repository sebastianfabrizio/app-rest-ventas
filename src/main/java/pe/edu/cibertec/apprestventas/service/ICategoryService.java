package pe.edu.cibertec.apprestventas.service;

import pe.edu.cibertec.apprestventas.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int id);
    Category save(Category category);
    void delete(int id);
}
