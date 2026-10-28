package br.com.pedro.java_task_manager_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TaskController {
    @GetMapping("/api/tasks")
    public List<String> listarTarfas(){
        return List.of();
    }
}
