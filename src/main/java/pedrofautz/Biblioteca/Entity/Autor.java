package pedrofautz.Biblioteca.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_autor")

@Getter
@Setter

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // Atributos
    public String nome;

    // Lista de Livros
}
