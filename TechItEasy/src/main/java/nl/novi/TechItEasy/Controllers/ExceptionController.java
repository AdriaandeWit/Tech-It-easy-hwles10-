package nl.novi.TechItEasy.Controllers;

import nl.novi.TechItEasy.Exceptions.IndexOutOfBounds;
import nl.novi.TechItEasy.Exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.javapoet.ClassName;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class ExceptionController {


    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND); }


    @ExceptionHandler(value = IndexOutOfBounds.class)
    public ResponseEntity<Object> exception(IndexOutOfBounds exeption){
        return new ResponseEntity<>(exeption.getClass(),HttpStatus.)}
    }
}
