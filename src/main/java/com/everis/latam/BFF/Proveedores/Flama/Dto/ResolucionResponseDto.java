package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;



import lombok.Data;

@Data
public class ResolucionResponseDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idResolucion;
	private	int	montoTotal;
	private String	comentario;
	
}
