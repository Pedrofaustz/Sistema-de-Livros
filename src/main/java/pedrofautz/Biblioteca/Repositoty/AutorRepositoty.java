package pedrofautz.Biblioteca.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import pedrofautz.Biblioteca.Entity.Autor;

public interface AutorRepositoty extends JpaRepository<Autor, Long> {
}
