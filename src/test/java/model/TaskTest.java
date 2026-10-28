package model;

import br.com.pedro.java_task_manager_api.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    private Task teste;

    @BeforeEach
    void prepararTeste() {
        teste = new Task("Primeira Tarefa", "Descrição");
    }
    @Test
    void TestaSeAClasseIniciaCompleta(){
        assertFalse(teste.isCompleted());
    }
    @Test
    void TestaTituloeRecuperaTitulo(){
        teste.setTitle("Primeira Tarefa");
        assertEquals("Primeira Tarefa",teste.getTitle());
    }
    @Test
    void TestaSetTituloEmBrancoOuNull(){
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle(""));
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle(null));
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle("      "));
    }
}
