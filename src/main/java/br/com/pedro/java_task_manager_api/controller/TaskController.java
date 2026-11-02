package br.com.pedro.java_task_manager_api.controller;

import br.com.pedro.java_task_manager_api.model.Task;
import br.com.pedro.java_task_manager_api.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @RequestMapping("/api/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task criarTarefa(@RequestBody Task tarefa){
            return taskService.criarTarefa(tarefa.getTitle(), tarefa.getDescription());
    }
    @GetMapping("/api/tasks")
    public List<Task> listarTarefas() {
        return taskService.listarTodas();
    }
}
