package model;

import br.com.pedro.java_task_manager_api.model.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TaskTest {
    @Test
    void TaskTest(){
        Task teste = new Task();
        assertFalse(teste.isCompleted());
        teste.setTitle("Primeira Tarefa");
        assertEquals("Primeira Tarefa",teste.getTitle());
    }
}
