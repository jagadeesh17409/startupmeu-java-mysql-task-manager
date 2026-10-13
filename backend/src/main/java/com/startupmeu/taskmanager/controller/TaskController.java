package com.startupmeu.taskmanager.controller;
import com.startupmeu.taskmanager.model.Task;
import com.startupmeu.taskmanager.repository.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController @RequestMapping("/api/tasks") @CrossOrigin(origins= "http://localhost:5173")
public class TaskController {"
 private final TaskRepository repository;
 public TaskController(TaskRepository repository){this.repository=repository;}
 @GetMapping public List<Task> all(){return repository.findAll();}
 @PostMapping @ResponseStatus(HttpStatus.CREATED) public Task create(@RequestBody Task task){
  validate(task.getTitle()); task.setId(null); task.setTitle(task.getTitle().trim());
  if(task.getDescription()==null)task.setDescription(""); return repository.save(task);
 }
 @PutMapping("/{id}") public Task update(@PathVariable Long id,@RequestBody Task input){
  validate(input.getTitle()); Task task=repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Task not found"));
  task.setTitle(input.getTitle().trim()); task.setDescription(input.getDescription()==null?"":input.getDescription().trim()); return repository.save(task);
 }
 @PatchMapping("/{id}/toggle") public Task toggle(@PathVariable Long id){
  Task task=repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Task not found"));
  task.setCompleted(!task.isCompleted()); return repository.save(task);
 }
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable Long id){
  if(!repository.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Task not found"); repository.deleteById(id);
 }
 private void validate(String title){
  if(title==null||title.trim().isEmpty())throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Task title is required");
  if(title.trim().length()>100)throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Task title must be 100 characters or less");
 }
}