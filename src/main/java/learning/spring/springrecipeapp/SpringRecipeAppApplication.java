package learning.spring.springrecipeapp;

import learning.spring.springrecipeapp.domain.Category;
import learning.spring.springrecipeapp.repository.CategoryRepository;
import learning.spring.springrecipeapp.repository.UnitOfMeasureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringRecipeAppApplication {
    private static CategoryRepository categoryRepository;

    private final UnitOfMeasureRepository unitOfMeasureRepository;
    public SpringRecipeAppApplication(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRecipeAppApplication.class, args);
        Optional<Category> optionalCategory=categoryRepository.findByDescription("Italian");
        System.out.println("Id is:"+optionalCategory.get().getId());
    }

}
