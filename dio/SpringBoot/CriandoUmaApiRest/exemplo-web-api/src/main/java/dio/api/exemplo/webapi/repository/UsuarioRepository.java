package dio.api.exemplo.webapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.api.exemplo.webapi.handler.BusinessException;
import dio.api.exemplo.webapi.model.Usuario;

@Repository
public class UsuarioRepository {
  public void save(Usuario usuario){
    if(usuario.getId()==null)
      throw new BusinessException("O campo login é obrigatório");
    if(usuario.getId()==null)
      System.out.println("SAVE = Recebendo o usuário na camada de repositório");
    else
      System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

    System.out.println(usuario);
  }

  public void deleteById(Integer id){
    System.out.println(String.format("DELETE/Id - Recebendo o Id: %d para excluir um usuário", id));
    System.out.println(id);
  }

  public List<Usuario> findAll(){
    System.out.println("LIST - listando os usuários do sistema");
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("sandroh", "123"));
    usuarios.add(new Usuario("teste", "123"));
    return usuarios;
  }

  public Usuario findById(Integer id){
    System.out.println(String.format("FIND/id - recebendo o id: %d para localizar um usuário", id));
    return new Usuario("sandroh", "123");
  }

  public Usuario findByUserName(String username){
    System.out.println(String.format("FIND/username - recebendo o username: %s para localizar um usuário", username));
    return new Usuario("sandroh", "123");
  }
}
