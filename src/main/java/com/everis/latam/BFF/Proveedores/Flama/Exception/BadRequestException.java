package com.everis.latam.BFF.Proveedores.Flama.Exception;

import java.io.IOException;

public class BadRequestException extends IOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException(String msg) {
		super(msg);
	}
}
