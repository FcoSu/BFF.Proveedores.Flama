package com.everis.latam.BFF.Proveedores.Flama.Entity;

import com.everis.latam.BFF.Proveedores.Flama.Dto.AreaDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.ProveedorDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.SolicitanteDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.SolicitudDto;

import lombok.Data;

@Data
public class Request{
	private ProveedorDto proveedor;	
	private AreaDto area;	
	private SolicitanteDto solicitante;	
	private SolicitudDto solicitud;	
	private String descripcion;

}
