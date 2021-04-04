package com.everis.latam.BFF.Proveedores.Flama.Entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;



@Data
public class Response {

	String estatus;
	String resolucion;
	int idResolucion;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Timestamp fechaResolucion;
	int idSolicitud;
}
