package com.uce.edu.demo.matricula.service;

import com.uce.edu.demo.matricula.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void ingresar(Vehiculo v );

	public void actualizar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void borrar(String precio);
}
