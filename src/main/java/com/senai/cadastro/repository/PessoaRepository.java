package com.senai.cadastro.repository;

import com.senai.cadastro.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findByDocumento(String documento);
}
