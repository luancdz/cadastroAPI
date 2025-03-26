package com.senai.cadastro.http.api;

import com.senai.cadastro.http.api.dto.PessoaDTO;
import com.senai.cadastro.service.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final CadastroService pessoaService;

    public PessoaController(CadastroService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<String> criarPessoa(@Valid @RequestBody PessoaDTO pessoaDTO) {
        pessoaService.salvarPessoa(pessoaDTO);
        return new ResponseEntity<>("Pessoa criada com sucesso!", HttpStatus.CREATED);
    }

    @GetMapping("/documento/{numeroDocumento}")
    public ResponseEntity<List<PessoaDTO>> buscarPessoasPorDocumento(@PathVariable String numeroDocumento) {
        List<PessoaDTO> pessoas = pessoaService.buscarPessoasPorDocumento(numeroDocumento);
        return new ResponseEntity<>(pessoas, HttpStatus.OK);
    }
}
