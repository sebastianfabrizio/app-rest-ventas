package pe.edu.cibertec.apprestventas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.apprestventas.model.Category;
import pe.edu.cibertec.apprestventas.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService{

    private final CategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Category> findById(Integer id) {
       return repository.findById(id);
    }


    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category updateCategoryName(Category category) {
      repository.actualizarNombreCategoria(category.getCategoryid(), category.getCategoryname());
      return category;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
