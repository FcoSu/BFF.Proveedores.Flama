package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class ProveedorDto implements Serializable{

	private static final long serialVersionUID = 1L;
	String idProveedor; 
	String nombre;
	String razonSocial;
	String rut;
	String email;
	
	
}
