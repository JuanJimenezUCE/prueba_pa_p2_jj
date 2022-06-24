package com.uce.edu.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Override
	public void ingresar(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crear(p);
	}
	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
	}

	
}
