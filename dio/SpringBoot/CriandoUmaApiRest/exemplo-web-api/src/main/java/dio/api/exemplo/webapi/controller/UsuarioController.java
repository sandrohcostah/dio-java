package dio.api.exemplo.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.api.exemplo.webapi.model.Usuario;
import dio.api.exemplo.webapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
  @Autowired
  private UsuarioRepository repository;
  @GetMapping("/users")
  public List<Usuario> getUsers(){
    return repository.findAll();
  }
  //usar valor que vai vir na URI como parametro
  @GetMapping("/users/{username}")
  public Usuario getOne(@PathVariable("username") String username){
    return repository.findByUserName(username);
  }

  //Delete
  //Requisições no navegador só realizam metódos get, então precisa de um cliente http (postman)
  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable("id") Integer id){
    repository.deleteById(id);
  }

  @PostMapping("/users")
  public void postUser(@RequestBody Usuario usuario){
    repository.save(usuario);
  }

  @PutMapping()
  public void putUser(@RequestBody Usuario usuario){
    repository.save(usuario);
  }
}
