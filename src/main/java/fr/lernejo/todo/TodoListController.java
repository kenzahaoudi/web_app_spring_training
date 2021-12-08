package fr.lernejo.todo;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
*/
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController

public class TodoListController {
    ArrayList<Todo> ListToDo = new ArrayList<>();

    @GetMapping(value = "/api/todo")
    public ArrayList<Todo> getList(){
        return ListToDo;
    }

    @PostMapping(value = "/api/todo")
    public void add(@RequestBody Todo todo){
        ListToDo.add(todo);
    }
}
