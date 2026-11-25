package pedrofautz.Biblioteca.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_livro")

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livro {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // Atributos
    public String nome;

    // Relacionamento de 1 Autor para N Livros
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
}
