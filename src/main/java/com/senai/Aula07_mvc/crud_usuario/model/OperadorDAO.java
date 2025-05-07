package com.senai.Aula07_mvc.crud_usuario.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class OperadorDAO {
    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create(); //Construtor do Json

    private List<Operador> carregar(){
        try(FileReader reader = new FileReader(FILE_PATH)){
            Type listType = new TypeToken <ArrayList<Operador>>(){}.getType(); //Interpreta o dado e faz  a conversão.

            return gson.fromJson(reader, listType); //Ler o arquivo no formato Json e depois cria a lista para devolver a lista completa

        }catch (IOException e){
            return new ArrayList<>(); //Em caso de erro devolve a lista vazia
        }
    }

    public OperadorDAO() {
        carregar();
    }

    public void salvar (Operador operador){
        operadores.add(operador);
        salvarJson();
    }

    public void salvarJson(){
        try (FileWriter writer = new FileWriter(FILE_PATH)){
            gson.toJson(operadores, writer);
            //escreve no arquivo, 'salva' e depois converte para gravar no arquivo

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List <Operador> listar(){
        return operadores; //delvove a lista criada antes
    }

    public void atualizar(Operador operador){
        operadores.set(operador.getId(), operador);
        salvarJson();
    }

    public void deletar(int id){
        operadores.remove(id);
        salvarJson();
    }
}
