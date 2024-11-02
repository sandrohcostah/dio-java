package com.spring.exemplo_spring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.exemplo_spring.model.Cliente;
import com.spring.exemplo_spring.model.ClienteRepository;
import com.spring.exemplo_spring.model.Endereco;
import com.spring.exemplo_spring.model.EnderecoRepository;
import com.spring.exemplo_spring.service.ClienteService;
import com.spring.exemplo_spring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
  //Singleton: Implementar os componentes do Spring com @Autowired
  @Autowired
  private ClienteRepository clienteRepository;
  @Autowired
  private EnderecoRepository enderecoRepository;
  @Autowired
  private ViaCepService viaCepService;

  // Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
  
  @Override
  public Iterable<Cliente> buscarTodos(){
    return clienteRepository.findAll();
  }

  @Override
  public Cliente buscarPorId(Long id){
    Optional<Cliente> cliente = clienteRepository.findById(id);
    return cliente.get();
  }

  @Override
  public void inserir(Cliente cliente){
    salvarClienteComCep(cliente);
  }

  @Override
  public void atualizar(Long id, Cliente cliente){
    //Buscar cliente por ID, caso exista
    Optional<Cliente> clienteBd = clienteRepository.findById(id);
    if(clienteBd.isPresent()){
      //Verificar se o Endereco do Cliente já existe (pelo cep)
      salvarClienteComCep(cliente);
      //Caso não exista, integrar com o ViaCep e persistir o retorno
      //Alterar Cliente, vinculando o Endereco (novo ou existente)
      
    }
  }

  @Override
  public void deletar(Long id){
    clienteRepository.deleteById(id);
  }

  private void salvarClienteComCep(Cliente cliente){
    //Verificar se o endereço do cliente já existe pelo cep
    String cep = cliente.getEndereco().getCep();
    Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
      //Caso não exista, integrar com o ViaCep e persistir o retorno
      Endereco novoEndereco = viaCepService.consultarCep(cep);
      enderecoRepository.save(novoEndereco);
      return novoEndereco;
    });
    cliente.setEndereco(endereco);
    //Inserir Cliente, vinculando o Endereco (novo ou existente)
    clienteRepository.save(cliente);
  }
}
