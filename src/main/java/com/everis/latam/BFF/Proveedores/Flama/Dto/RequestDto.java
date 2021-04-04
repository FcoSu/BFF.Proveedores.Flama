package com.everis.latam.BFF.Proveedores.Flama.Dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RequestDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ProveedorDto proveedor;	
	private AreaDto area;	
	private SolicitanteDto solicitante;	
	private SolicitudDto solicitud;	
	private String descripcion;
	

}
