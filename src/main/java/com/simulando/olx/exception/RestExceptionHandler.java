package com.simulando.olx.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@Autowired
	private ReadMessages readMessages;
	
	@ExceptionHandler(value=DefaultException.class)
	public ResponseEntity<?> dafultHandle(HttpServletRequest req, DefaultException exception) {
		
		ExceptionDetail exceptionDetail = ExceptionDetail
				.builder()
				.timestamp(new Date().getTime())
				.titulo(exception.getConstanteException().getTitulo())
				.detalhe(readMessages.getPropertie(exception.getConstanteException().getMensagem()))
				.status(exception.getConstanteException().getStatus().value())
				.URL(req.getRequestURL().toString())
				.build();
		
		return new ResponseEntity<>(exceptionDetail, exception.getConstanteException().getStatus());
	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		List<ValidationDetail> validacoes = new ArrayList<>();
		
		for(FieldError error : fieldErrors){
			ValidationDetail validacao = new ValidationDetail();
			validacao.setCampo(error.getField());
			validacao.setMensagemDeErro(error.getDefaultMessage());
			validacoes.add(validacao);
		}
		
		ValidationErrorDetail validationErrorDetail = ValidationErrorDetail
				.builder()
				.timestamp(new Date().getTime())
				.titulo("Erro de validaçao")
				.detalhe("Ocorreu um erro de validação dos dados")
				.status(HttpStatus.BAD_REQUEST.value())
				.URL(request.getDescription(false))
				.validacoes(validacoes)
				.build();
		
		return new ResponseEntity<>(validationErrorDetail, HttpStatus.BAD_REQUEST);
	}

	protected ResponseEntity<Object> handleExceptionInternal(Exception exception, @Nullable Object body,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		ExceptionDetail exceptionDetail = ExceptionDetail
				.builder()
				.timestamp(new Date().getTime())
				.titulo("Internal Exception")
				.detalhe(exception.getMessage())
				.status(status.value())
				.URL(request.getDescription(false))
				.build();
		
		return new ResponseEntity<>(exceptionDetail, headers, status);
	}


}
