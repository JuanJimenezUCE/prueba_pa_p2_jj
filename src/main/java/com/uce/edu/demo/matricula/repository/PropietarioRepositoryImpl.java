package com.uce.edu.demo.matricula.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matricula.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el propietario: "+p);
	}

	@Override
	public void eliminar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el propiertario: "+p);
	}

}
