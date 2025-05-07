package com.senai.Aula07_mvc.crud_usuario.model;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SupervisorDAO {
    private List<Supervisor> supervisores;
    private final String FILE_PATH = "supervisores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create(); //Construtor do Json

    private List<Supervisor> carregar(){
        try(FileReader reader = new FileReader(FILE_PATH)){
            Type listType = new TypeToken <ArrayList<Supervisor>>(){}.getType(); //Interpreta o dado e faz  a conversão.

            return gson.fromJson(reader, listType); //Ler o arquivo no formato Json e depois cria a lista para devolver a lista completa

        }catch (IOException e){
            return new ArrayList<>(); //Em caso de erro devolve a lista vazia
        }
    }

    public void salvar (Supervisor supervisor){

    }

    public List<Supervisor> listar(){
        List <Supervisor> lista;
        return lista;
    }

    public void atualizar(Supervisor supervisor){

    }

    public void deletar(int id){

    }
}
