package com.homiak.ex07.service;

import com.homiak.ex07.models.FornecedorModel;
import com.homiak.ex07.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public FornecedorModel salvar(FornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    public List<FornecedorModel> listar() {
        return repository.findAll();
    }

    public Optional<FornecedorModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}