package com.Ejercicio123.controller;

import com.Ejercicio123.entities.Laptop;
import com.Ejercicio123.repository.Laptoprepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import springfox.documentation.spring.web.json.Json;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControlerTest {
    private TestRestTemplate testRestTemplate;
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder= restTemplateBuilder.rootUri("http://localhost:"+port);
        testRestTemplate=new TestRestTemplate(restTemplateBuilder);
    }


    @Test
    void listaLaptop() {
        testRestTemplate.getForEntity("/ListaLaptop", Laptop[].class);
        List<Laptop> laptops= Arrays.asList();
        Laptop laptop1=new Laptop(null,"Dell", "XPS","Procesador Intel® Core™ i5-1135G7 de 11.ª generación",
                "Memoria integrada LPDDR4x de 8 GB a 4267 MHz",
                "SSD de 256 GB","Gráficos Intel® Iris Xe",6);


        testRestTemplate.put("/ListaLaptop",laptop1);
        System.out.println(testRestTemplate);
    }

    @Test
    void listaPorId() {
     //   testRestTemplate.get(2L);
    }

//    @Test
//    void crear() {
//        Laptop laptop=new Laptop(null,"hp","Clone 9","Procesador i9","32Gb", "SSD 1024Gb", "Nexus",8);
//        laptoprepository.save(laptop);
//    }
//
//    @Test
//    void actualiza() {
//        Laptop laptop=new Laptop(2L,"Onmicron","Clone 9","Procesador i9","32Gb", "SSD 1024Gb", "Nexus",8);
//        laptoprepository.save(laptop);
//    }
//
//    @Test
//    void borraPorId() {
//    }
//
//    @Test
//    void borratodos() {
//    }
}