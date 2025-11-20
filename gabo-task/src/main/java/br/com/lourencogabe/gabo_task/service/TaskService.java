package br.com.lourencogabe.gabo_task.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.lourencogabe.gabo_task.entity.Task;
import br.com.lourencogabe.gabo_task.repository.TaskRepository;
import org.springframework.data.domain.Sort;

/**
 *
 * @author gabriel.lourenco
 */

//Anotação para definir uma classe de serviço no Spring
@Service
public class TaskService {
    //Injeção do repositório de tarefas
    private TaskRepository taskRepository;
    //construtor para injeção de dependência
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> create(Task task) {
        // Lógica para criar uma nova tarefa
        taskRepository.save(task);
        return list();
    }

    public List<Task> list() {
        Sort ordenationList = Sort.by( "priority").descending().and(Sort.by("title").ascending());
        // Lógica para listar todas as tarefas
        return taskRepository.findAll(ordenationList);
    }

    public List <Task> update(Task task) {
        taskRepository.save(task);
        return list(); // Retornar a tarefa atualizada
    }

    public List <Task> delete(long id) {
        // Lógica para deletar uma tarefa passando somente o ID
        taskRepository.deleteById(id);
        return list(); // Retornar confirmação de exclusão
    }
}
