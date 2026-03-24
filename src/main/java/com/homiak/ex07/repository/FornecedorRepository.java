package com.homiak.ex07.repository;

import com.homiak.ex07.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}