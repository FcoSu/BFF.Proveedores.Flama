package com.everis.latam.BFF.Proveedores.Flama.Controller;

import java.util.Arrays;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.latam.BFF.Proveedores.Flama.Dto.AreaDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.ProveedorDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.RequestDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.SolicitanteDto;
import com.everis.latam.BFF.Proveedores.Flama.Dto.SolicitudDto;
import com.everis.latam.BFF.Proveedores.Flama.Entity.Request;
import com.everis.latam.BFF.Proveedores.Flama.Entity.Response;
import com.everis.latam.BFF.Proveedores.Flama.Exception.BadRequestException;
import com.everis.latam.BFF.Proveedores.Flama.Exception.ExceptionPost;
import com.everis.latam.BFF.Proveedores.Flama.URLs.URLs;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/")
public class RequestController {
	
	public String proveedor_Nombre;
	public String proveedor_RazonSocial;
	public int proveedor_IdProveedor;
	public String proveedor_Rut;
	public String proveedor_Email;
	
	public String area_NombreArea;
	public String area_Responsable;
	public String area_Email;
	public String area_Ceco;
	
	public String solicitante_NombreSolicitante;
	public String solicitante_cargo;
	public int solicitante_IdAprovador;
	public String solicitante_Aprovador;
	public String solicitante_Email;
	
	public int solicitud_Numero;
	public int solicitud_Monto;
	public float solicitud_iva;
	public String solicitud_prioridad;
	
	
	private HttpHeaders headers = new HttpHeaders();
	/*
	@Autowired
	private RestTemplate restTemplate;*/
	
	@RequestMapping(value = URLs.inputURL, method = RequestMethod.POST, consumes= "application/json")
	public ResponseEntity<Response> sendRequest(@RequestBody RequestDto req) throws BadRequestException{

			
		ProveedorDto p = new ProveedorDto();
		p = req.getProveedor();
		log.info("proveedor: "+p);
		
		
		AreaDto a = new AreaDto();
		a = req.getArea();
		log.info("area: "+a);
		
		SolicitanteDto ste = new SolicitanteDto();
		ste = req.getSolicitante();
		log.info("solicitante: "+ste);
		

		SolicitudDto stud = new SolicitudDto();
		stud = req.getSolicitud();
		log.info("solicitud: "+stud);
		
		RequestDto reqDto = new RequestDto();
		reqDto.setArea(a);
		reqDto.setDescripcion(req.getDescripcion());
		reqDto.setProveedor(p);
		reqDto.setSolicitante(ste);
		reqDto.setSolicitud(stud);
		
		log.info("Request completa = "+reqDto);
	
	
		try {
			
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<RequestDto> entity = new HttpEntity<>(reqDto,headers);
			
			log.info("SOLICITANDO");
			
			/*
			Response res = restTemplate.exchange(
					URLs.targetURL, HttpMethod.POST, entity, Response.class).getBody();*/
			Response res = null;
			
			log.info("RESPONDIDO");
			return new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			throw new BadRequestException(ExceptionPost.error);
		}
		
		
	
		
		
		
	}
	}
