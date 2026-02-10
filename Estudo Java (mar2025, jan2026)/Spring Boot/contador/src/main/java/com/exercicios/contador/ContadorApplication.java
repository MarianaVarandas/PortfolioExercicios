package com.exercicios.contador;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var numeroInserido = 0;
        int n = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número final: ");
        numeroInserido = input.nextInt();

        while (n <= numeroInserido){
            System.out.println(n);
            n++;
        }

        Tarefa tarefa1 = new Tarefa("lavar a louça", true, "Mariana");//para serializar
        Tarefa tarefa2 = new Tarefa("limpar banheiro", false, "Caio");// gerei essa pra desserializar

        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("tarefa.json"), tarefa1);//transformando em arquivo json
            mapper.writeValue(new File("tarefa2.json"), tarefa2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        Tarefa tarefaDesserializada = mapper.readValue(new File("tarefa2.json"),Tarefa.class); // lendo arquivo e transformando em objeto

        System.out.println(tarefaDesserializada);


    }
}
