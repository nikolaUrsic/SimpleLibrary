package hr.nursic.library.controller;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import hr.nursic.library.exception.MicroblinkApiException;
import hr.nursic.library.exception.ResourceNotAvailableException;
import hr.nursic.library.exception.ResourceNotFoundException;

@ControllerAdvice 
public class AbstractController {
	
	@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(
    		ResourceNotFoundException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(ResourceNotAvailableException.class)
    public ResponseEntity<Object> handleResourceNotAvailableException(
    		ResourceNotAvailableException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.CONFLICT);
    }
	
	@ExceptionHandler(MicroblinkApiException.class)
    public ResponseEntity<Object> handleMicroblinkApiException(
    		MicroblinkApiException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
