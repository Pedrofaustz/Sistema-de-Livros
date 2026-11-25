package pedrofautz.Biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedrofautz.Biblioteca.Entity.Autor;
import pedrofautz.Biblioteca.Repositoty.AutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository repositoty;

    // Teste Http
    public String testeAutor(){
        return "200";
    }

    // Create
    public Autor criateAutor(Autor data){
        if (data == null) {
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.save(data);
    }


    // Read All
    public List<Autor> readAllAutor(){
        if (repositoty.findAll() == null){
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.findAll();
    }

    // Read By Id
    public Optional<Autor> readById(Long id) {
        if (repositoty.existsById(id) == false) {
            throw new IllegalArgumentException("Erro: 404");
        }
        return repositoty.findById(id);
    }

    // Exist By Id
    public Boolean existAutor(Long id){
        return repositoty.existsById(id);
    }


    // Update
    public Autor updateAutor(Long id, Autor data){
        if (id <= 0 || data == null) {
            throw new IllegalArgumentException("Erro: 404");
        }

        Optional<Autor> dataUpdate = repositoty.findById(id);
        update(data, dataUpdate);
        dataUpdate.get().setId(id);
        return repositoty.save(dataUpdate.get());
    }

    private void update(Autor data, Optional<Autor> dataUpdate){
       dataUpdate.get().setNome(data.getNome());
    }


    // Delete
    public void deleteAutor(Long id){
        if (id <= 0){
            throw new IllegalArgumentException("Erro: 404");
        }
        repositoty.deleteById(id);
    }
}
