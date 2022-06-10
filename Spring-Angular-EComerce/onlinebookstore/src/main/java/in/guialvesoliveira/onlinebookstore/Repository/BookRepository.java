package in.guialvesoliveira.onlinebookstore.Repository;

import in.guialvesoliveira.onlinebookstore.Entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;



public interface BookRepository extends JpaRepository<Book, Long> {

    @RestResource(path = "categoryid")
    Page<Book> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    @RestResource(path = "searchbykeyword")
    Page<Book> findByNameContaining(@RequestParam("name") String keyword, Pageable pageable);

}
