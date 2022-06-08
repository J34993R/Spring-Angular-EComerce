package in.guialvesoliveira.onlinebookstore.Repository;

import in.guialvesoliveira.onlinebookstore.Entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
