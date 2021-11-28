package com.br.juliomoraes.listatarefas.controller.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class StandardError {

    private Instant timestamp;
    private int status;
    private String erro;
    private String mensagem;
    private String path;
}
