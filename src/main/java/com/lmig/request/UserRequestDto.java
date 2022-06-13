package com.lmig.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDto implements Serializable {
    private static final long serialVersionUID = -68494470754667710L;

    @Email(message = "invalid email or domain.")
    private String email;

    @Size(min = 3, message = "name should be at least 3 characters")
    private String name;

    @Size(min = 1, max = 1, message = "gender should be m/f/t")
    private String gender;
}

