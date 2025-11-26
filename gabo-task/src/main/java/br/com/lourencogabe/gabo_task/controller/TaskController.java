/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.lourencogabe.gabo_task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lourencogabe.gabo_task.entity.Task;
import br.com.lourencogabe.gabo_task.service.TaskService;

/**
 *
 * @author gabri
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    List<Task> create(@RequestBody Task task){
        return taskService.create(task);
    }

    @GetMapping
    List<Task> list(){
        return taskService.list();
    }

    @PutMapping
    List<Task> update(Task task){
        return taskService.update(task);
    }

    @DeleteMapping("{id}")
    List<Task> delete(@PathVariable("id") long id){
        return taskService.delete(id);
    }
}
