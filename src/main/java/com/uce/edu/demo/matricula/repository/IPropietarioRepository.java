package com.uce.edu.demo.matricula.repository;

import com.uce.edu.demo.matricula.modelo.Propietario;

public interface IPropietarioRepository {

	public void crear(Propietario p );
	
	public void eliminar(String cedula );
	
	public Propietario consultar(String cedula);
}
