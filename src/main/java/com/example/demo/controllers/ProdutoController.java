package com.example.demo.controllers;

import com.example.demo.models.ProdutoModel;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel){
        ProdutoModel criarProduto = produtoService.criarProduto(produtoModel);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produtoModel.getId()).toUri();

        return ResponseEntity.created(uri).body(produtoModel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> produtoModelList = produtoService.findAll();

        return ResponseEntity.ok().body(produtoModelList);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProdutoModel>> findById(@PathVariable Long id){
        Optional<ProdutoModel> produtoModelList = produtoService.findById(id);

        return ResponseEntity.ok().body(produtoModelList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produtoModel){
        ProdutoModel produtoModel1 = produtoService.atualizarProduto(id, produtoModel);

        return ResponseEntity.ok().body(produtoModel1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable Long id){
        produtoService.deletarProduto(id);

        return ResponseEntity.noContent().build();
    }

}
