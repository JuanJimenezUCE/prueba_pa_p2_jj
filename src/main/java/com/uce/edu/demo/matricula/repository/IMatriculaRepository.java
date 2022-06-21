package com.uce.edu.demo.matricula.repository;

import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.modelo.Vehiculo;

public interface IMatriculaRepository {

	
	public void crear(Propietario cedula,Vehiculo placa);
}
