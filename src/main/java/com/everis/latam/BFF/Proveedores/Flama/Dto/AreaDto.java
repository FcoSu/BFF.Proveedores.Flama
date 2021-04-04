package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AreaDto implements Serializable{

	private static final long serialVersionUID = 1L;
	String nombreArea;
	String responsable;
	String email;
	String ceco;
	
}
