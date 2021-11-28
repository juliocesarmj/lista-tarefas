package com.br.juliomoraes.listatarefas.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -8348341087284181255L;

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
