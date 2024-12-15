package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;
}
