package com.uce.edu.demo.matricula.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.modelo.Vehiculo;

public interface IFachadaMatriculaService {

	public void crear(Propietario cedula,Vehiculo placa);
	
	public BigDecimal calcularValor(String placa);
}
