package br.com.pedro.java_task_manager_api.model;
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
    void testaSeAClasseIniciaCompleta(){
        assertFalse(teste.isCompleted());
    }
    @Test
    void testaTituloeRecuperaTitulo(){
        teste.setTitle("Testando");
        assertEquals("Testando",teste.getTitle());
    }

    @Test
    void testaSetTituloEmBrancoOuNull(){
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle(""));
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle(null));
        assertThrows(IllegalArgumentException.class, ()->teste.setTitle("      "));
    }
    @Test
    void testaDataCriaçãodaTask(){
        assertNotNull(teste.getCreatedAt());
    }
    @Test
    void testaTaskFinalizada(){
        assertNull(teste.getCompletedAt());
    }
    @Test
    void testaConculuirTarefa(){
        teste.concluir();
        assertTrue(teste.isCompleted());
        assertNotNull(teste.getCompletedAt());
    }
    @Test
    void testaAberturadeTarefa(){
        teste.concluir();
        teste.reabrir();
        assertFalse(teste.isCompleted());
        assertNull(teste.getCompletedAt());
    }
    @Test
    void testaCriacaoComTituloNull(){
        assertThrows(
                IllegalArgumentException.class,
                () -> new Task(null, "Descrição")
        );
    }
    @Test
    void testaCriacaoComTituloComEspacos(){
        assertThrows(
                IllegalArgumentException.class,
                () -> new Task("   ", "Descrição")
        );
    }
}
