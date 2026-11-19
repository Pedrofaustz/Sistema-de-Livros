package pedrofautz.Biblioteca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pedrofautz.Biblioteca.Entity.Autor;
import pedrofautz.Biblioteca.Service.AutorService;

import java.util.List;
import java.util.Optional;

@RequestMapping("/autor")
@Controller
public class AutorController {
    @Autowired
    private AutorService service;

    // Http Teste
    @GetMapping("/teste")
    public ResponseEntity<String> testeAutor(){
        return ResponseEntity.ok(service.testeAutor());
    }

    // Criate
    @PostMapping()
    public ResponseEntity<Autor> criateAutor(@RequestBody Autor data){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criateAutor(data));
    }

    // Read All
    @GetMapping()
    public ResponseEntity<List<Autor>> readAllAutor(){
        return ResponseEntity.ok(service.readAllAutor());
    }

    // Read By Id
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Autor>> readByAutor(@PathVariable Long id){
        if (service.existAutor(id) == false){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(service.readById(id));
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@RequestBody Autor data, @PathVariable Long id){
        if (service.existAutor(id) == false){
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(service.updateAutor(id, data));
        }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAutor(@PathVariable Long id){
        if (service.existAutor(id) == false){
            return ResponseEntity.notFound().build();
        }

        service.deleteAutor(id);
        return ResponseEntity.noContent().build();
    }
}
