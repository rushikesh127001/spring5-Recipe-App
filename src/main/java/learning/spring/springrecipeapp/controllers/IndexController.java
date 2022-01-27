package learning.spring.springrecipeapp.controllers;

import learning.spring.springrecipeapp.domain.Category;
import learning.spring.springrecipeapp.repository.CategoryRepository;
import learning.spring.springrecipeapp.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Component
public class IndexController {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;


    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping(value = {"","/","index"})
    public String getDescription(){
        Optional<Category> optionalCategory=categoryRepository.findByDescription("Italian");
        System.out.println("Id is:"+optionalCategory.get().getId());
        return "index";
    }
}
