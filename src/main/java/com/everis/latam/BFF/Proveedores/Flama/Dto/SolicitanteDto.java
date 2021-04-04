package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SolicitanteDto implements Serializable{

	private static final long serialVersionUID = 1L;
	String nombreSolicitante;
	String cargo;
	int idAprovador;
	String Aprovador;
	
}
