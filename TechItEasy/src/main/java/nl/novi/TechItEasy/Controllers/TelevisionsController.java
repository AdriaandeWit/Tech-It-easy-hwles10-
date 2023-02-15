package nl.novi.TechItEasy.Controllers;

import nl.novi.TechItEasy.Exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {



    @GetMapping("televisions")
    public ResponseEntity<String> getAllTelevisions(){
         return ResponseEntity.ok("television");
       // return new ResponseEntity<>("television"+ id,H )
    }
----------------
    @GetMapping("televisions/{id}")
    public ResponseEntity<String>getTvWithId(@PathVariable int id){
        if(id == 5) {
            throw new RecordNotFoundException("Novi is de beste");
        }
        return ResponseEntity.ok("television" + id);


    }

    @PutMapping("televisions/{id}")
    public ResponseEntity<String>updateList(@PathVariable int id,@PathVariable String name){
        return ResponseEntity.noContent().build();
    }
    @PostMapping("Television")
    public ResponseEntity<String> addTvList(@RequestParam String televisions){
        return ResponseEntity.created(null).body(televisions);
    }


    @DeleteMapping("delete")
    public ResponseEntity<String > deleteById(@PathVariable int id ){
        return ResponseEntity.noContent().build();
    }







}
