package com.aceleracao.modelaai.dto;

public record CarDTO(
  String modelo,
  String fabricante,
  String dataFabricacao,
  Double valor,
  Integer anoModelo) {
  
}
