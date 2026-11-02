package br.com.pedro.java_task_manager_api.service;

import br.com.pedro.java_task_manager_api.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    private TaskService teste;

    @BeforeEach
    void prepararTeste() {
        teste = new TaskService();
        teste.criarTarefa("Estudar Java", "Estudando");
    }

    @Test
    void testaTituloCorreto() {
        Task tarefa = teste.criarTarefa("Estudar Java", "Estudando");

        assertEquals("Estudar Java", tarefa.getTitle());
    }

    @Test
    void testaRetornoDeTarefas() {
        assertEquals(1, teste.listarTodas().size());
    }

    @Test
    void testaCriacaoComTituloNull() {
        int quantidadeAntes = teste.listarTodas().size();

        assertThrows(
                IllegalArgumentException.class,
                () -> teste.criarTarefa(null, "testando")
        );

        assertEquals(quantidadeAntes, teste.listarTodas().size());
    }

    @Test
    void testaCriacaoComTituloVazio() {
        assertThrows(
                IllegalArgumentException.class,
                () -> teste.criarTarefa("", "testando")
        );
    }
}
