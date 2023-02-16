package nl.novi.TechItEasy.Controllers;

import nl.novi.TechItEasy.Exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {


    @GetMapping("/television")
    public ResponseEntity<String> getAllTelevisions(){
         return ResponseEntity.ok("television");
       // return new ResponseEntity<>("television"+ id,H )
    }
    @GetMapping("/television/{id}")
    public ResponseEntity<String>getTvWithId(@PathVariable int id){
        if(id == 5) {
            throw new RecordNotFoundException("Novi is de beste");
        }
        return ResponseEntity.ok("television" + id);
    }

    @PutMapping("/television/{id}")
    public ResponseEntity<String> updateTvList(@PathVariable int id, @RequestParam String name){
        return ResponseEntity.noContent().build();
    }
    @PostMapping("/television")
    public ResponseEntity<String> addTvList(@RequestBody String television){
        return ResponseEntity.created(null).body(television);
    }
    @DeleteMapping("/television/{id}")
    public ResponseEntity<String > deleteById(@PathVariable int id ){
        return ResponseEntity.noContent().build();
    }







}
