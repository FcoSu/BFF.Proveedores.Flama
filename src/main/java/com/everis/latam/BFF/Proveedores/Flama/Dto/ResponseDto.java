package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResponseDto implements Serializable{

	private static final long serialVersionUID = 1L;
	String Status;
	ResolucionResponseDto resolucion;
}
