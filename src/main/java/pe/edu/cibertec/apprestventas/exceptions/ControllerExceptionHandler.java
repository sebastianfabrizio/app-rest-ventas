package pe.edu.cibertec.apprestventas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import pe.edu.cibertec.apprestventas.dto.MensajeErrorDto;

import java.util.Date;

//le decimos a spring que esta clase manejara excepciones
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourcesNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MensajeErrorDto resourceNotFoundException(ResourcesNotFoundException ex, WebRequest request) {
        return MensajeErrorDto.builder()
                .mensaje(ex.getMessage())
                .codigoEstado(HttpStatus.NOT_FOUND.value())
                .fechaError(new Date())
                .descripcion(request.getDescription(true))
                .build();
    }
}
