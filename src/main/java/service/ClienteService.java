package service;

import model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodosClientes();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
