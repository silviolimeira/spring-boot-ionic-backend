package com.example.demo.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ItemPedido;
import com.example.demo.domain.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
