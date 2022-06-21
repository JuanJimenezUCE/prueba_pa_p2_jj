package com.uce.edu.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matricula.modelo.Vehiculo;
import com.uce.edu.demo.matricula.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void borrar(String precio) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(precio);
	}

}
