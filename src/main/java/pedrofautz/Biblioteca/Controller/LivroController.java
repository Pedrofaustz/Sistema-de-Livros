package pedrofautz.Biblioteca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pedrofautz.Biblioteca.Entity.Livro;
import pedrofautz.Biblioteca.Service.LivroService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/livro")
@Controller
public class LivroController {
    @Autowired
    private LivroService service;

    // Http Teste
    @GetMapping("/teste")
    public ResponseEntity<String> testeLivro(){
        return ResponseEntity.ok(service.testeLivro());
    }

    // Criate
    @PostMapping()
    public ResponseEntity<Livro> criateLivro(@RequestBody Livro data){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criateLivro(data));
    }

    // Read All
    @GetMapping()
    public ResponseEntity<List<Livro>> readAllLivro(){
        return ResponseEntity.ok(service.readAllLivro());
    }

    // Read By Id
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> readByLivro(@PathVariable Long id){
        if (service.existLivro(id) == false){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(service.readById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@RequestBody Livro data, @PathVariable Long id){
        if (service.existLivro(id) == false){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(service.updateLivro(id, data));
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable Long id){
        if (service.existLivro(id) == false){
            return ResponseEntity.notFound().build();
        }

        service.deleteLivro(id);
        return ResponseEntity.noContent().build();
    }
}
