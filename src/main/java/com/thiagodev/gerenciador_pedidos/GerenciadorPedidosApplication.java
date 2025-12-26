package com.thiagodev.gerenciador_pedidos;

import com.thiagodev.gerenciador_pedidos.model.Categoria;
import com.thiagodev.gerenciador_pedidos.model.Pedido;
import com.thiagodev.gerenciador_pedidos.model.Produto;
import com.thiagodev.gerenciador_pedidos.repository.CategoriaRepository;
import com.thiagodev.gerenciador_pedidos.repository.PedidoRepository;
import com.thiagodev.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private PedidoRepository pedidoRepository;


    public static void main(String[] args) {
        SpringApplication.run(GerenciadorPedidosApplication.class, args);
    }

    public void run(String... args) throws Exception {

        Produto produto = new Produto(1L, "Notebook", 3500.0);
        Categoria categoria = new Categoria(1L, "Eletrônicos");
        Pedido pedido = new Pedido(1L, LocalDate.now());

        produtoRepository.save(produto);
        categoriaRepository.save(categoria);
        pedidoRepository.save(pedido);
    }

}
