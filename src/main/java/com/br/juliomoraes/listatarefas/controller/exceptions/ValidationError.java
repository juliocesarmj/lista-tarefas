package com.br.juliomoraes.listatarefas.controller.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ValidationError extends StandardError{

    private List<FieldMessage> erros = new ArrayList<>();

    public List<FieldMessage> getErros() {
        return this.erros;
    }

    public void addError(String campo, String mensagem) {
        this.erros.add(new FieldMessage(campo, mensagem));
    }
}
