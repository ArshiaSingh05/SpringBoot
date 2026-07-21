package ArshiaSingh.demo.StudentServer.exception;

import ArshiaSingh.demo.StudentServer.DTO.ExceptionResponseDTO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResponseDTO> handleRuntimeExecutionException(RuntimeException e, HttpServletRequest req){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                e.getMessage(),
                req.getRequestURI()
        );

        return ResponseEntity.status(500).body(exceptionResponseDTO);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleExecutionException(Exception e){
        return ResponseEntity.status(500).body(e.getMessage());
    }
}
