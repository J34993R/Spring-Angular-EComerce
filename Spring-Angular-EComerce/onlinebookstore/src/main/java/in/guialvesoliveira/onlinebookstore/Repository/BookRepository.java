package in.guialvesoliveira.onlinebookstore.Repository;

import in.guialvesoliveira.onlinebookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
