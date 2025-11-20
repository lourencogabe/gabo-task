package br.com.lourencogabe.gabo_task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lourencogabe.gabo_task.entity.Task;

/**
 *
 * @author gabriel.lourenco
 */

//Interface que estende JpaRepository para fornecer operações CRUD para a tabela Task
//JpaRepository<Task, Long> indica que a entidade gerenciada é Task e o tipo do ID é Long
public interface TaskRepository extends JpaRepository<Task, Long> {

}
