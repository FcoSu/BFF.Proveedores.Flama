package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SolicitudDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int numero;
	int monto;
	float iva;
	String prioridad;
}
