package br.com.pedro.java_task_manager_api.service;

import br.com.pedro.java_task_manager_api.model.Task;

import java.util.ArrayList;
import java.util.List;


public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    public List<Task> listarTodas(){
        return new ArrayList<>(tasks);
    }
    public Task criarTarefa(String titulo, String desc) {
        Task tarefa = new Task(titulo, desc);
        tasks.add(tarefa);
        return tarefa;
    }
}