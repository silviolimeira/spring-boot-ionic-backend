package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import com.example.demo.domain.Categoria;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Demo1ApplicationTests {
	
    private static final Logger LOGGER = Logger.getLogger(Demo1ApplicationTests.class.getName());

	@Test
	@BeforeAll
	static void contextLoads() {
	}
	
	@Test 
	@Order(1)
	void teste() {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(cat1, cat2));
		
        LOGGER.log(Level.INFO, lista.toString());
				
	}

}
