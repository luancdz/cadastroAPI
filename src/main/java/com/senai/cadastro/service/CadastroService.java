package com.senai.cadastro.service;

import com.senai.cadastro.http.api.dto.PessoaDTO;
import com.senai.cadastro.model.Pessoa;
import com.senai.cadastro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CadastroService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void salvarPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setSobrenome(pessoaDTO.getSobrenome());
        pessoa.setTelefone(pessoaDTO.getTelefone());
        pessoa.setDocumento(pessoaDTO.getDocumento());
        pessoa.setEmail(pessoaDTO.getEmail());
        pessoaRepository.save(pessoa);
    }

    public List<PessoaDTO> buscarPessoasPorDocumento(String numeroDocumento) {
        List<Pessoa> pessoas = pessoaRepository.findByDocumento(numeroDocumento);
        return pessoas.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private PessoaDTO convertToDTO(Pessoa pessoa) {
        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNome(pessoa.getNome());
        pessoaDTO.setSobrenome(pessoa.getSobrenome());
        pessoaDTO.setTelefone(pessoa.getTelefone());
        pessoaDTO.setDocumento(pessoa.getDocumento());
        pessoaDTO.setEmail(pessoa.getEmail());
        return pessoaDTO;
    }
}
