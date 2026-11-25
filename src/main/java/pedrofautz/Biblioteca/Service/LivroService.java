package pedrofautz.Biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrofautz.Biblioteca.Entity.Livro;
import pedrofautz.Biblioteca.Repositoty.LivroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repositoty;

    // Teste Http
    public String testeLivro(){
        return "200";
    }

    // Create
    public Livro criateLivro(Livro data){
        if (data == null) {
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.save(data);
    }


    // Read All
    public List<Livro> readAllLivro(){
        if (repositoty.findAll() == null){
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.findAll();
    }

    // Read By Id
    public Optional<Livro> readById(Long id) {
        if (repositoty.existsById(id) == false) {
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.findById(id);
    }

    // Exist By Id
    public Boolean existLivro(Long id){
        return repositoty.existsById(id);
    }


    // Update
    public Livro updateLivro(Long id, Livro data){
        if (id <= 0 || data == null) {
            throw new IllegalArgumentException("Erro: 404");
        }

        Optional<Livro> dataUpdate = repositoty.findById(id);
        update(data, dataUpdate);
        dataUpdate.get().setId(id);
        return repositoty.save(dataUpdate.get());
    }

    private void update(Livro data, Optional<Livro> dataUpdate){
        dataUpdate.get().setNome(data.getNome());
    }


    // Delete
    public void deleteLivro(Long id){
        if (id <= 0){
            throw new IllegalArgumentException("Erro: 404");
        }
        repositoty.deleteById(id);
    }
}
