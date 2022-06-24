package com.uce.edu.demo.matricula.repository;

import java.time.LocalDateTime;

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
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setNombre("Juan");
		p.setApellido("Jimenez");
		p.setCedula(cedula);
		p.setFecha(LocalDateTime.now());
		return p;
	}



	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el propiertario: "+cedula);
	}

}
