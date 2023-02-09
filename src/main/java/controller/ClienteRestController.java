package controller;

import model.Cliente;
import model.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import service.ClienteService;

import java.util.Optional;

public class ClienteRestController implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
       Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
