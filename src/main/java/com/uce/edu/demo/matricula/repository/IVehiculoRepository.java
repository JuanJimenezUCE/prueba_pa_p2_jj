package com.uce.edu.demo.matricula.repository;

import com.uce.edu.demo.matricula.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo v );
	
	public void actualizar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	
	public void eliminar(String placa);
	
	
}
