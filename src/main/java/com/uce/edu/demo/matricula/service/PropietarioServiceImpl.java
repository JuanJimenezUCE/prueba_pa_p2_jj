package com.uce.edu.demo.matricula.service;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService{

	
	private IPropietarioRepository propietarioRepository;
	@Override
	public void ingresar(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crear(p);
	}

	@Override
	public void borrar(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(p);
	}

}
