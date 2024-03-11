package br.com.fiap.springpfauthentication.resource;

import br.com.fiap.springpfauthentication.entity.Permissao;
import br.com.fiap.springpfauthentication.repository.PermissaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PermissaoResource {
    @Autowired
    private PermissaoRepository repo;

    @GetMapping
    public List<Permissao> findAll() {
        return repo.findAll();
    }
    @GetMapping(value = "/{id}")
    public Permissao findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Permissao save(@RequestBody Permissao permissao) {
        return repo.save(permissao);
    }
}
