package pedrofautz.Biblioteca.Repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import pedrofautz.Biblioteca.Entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
