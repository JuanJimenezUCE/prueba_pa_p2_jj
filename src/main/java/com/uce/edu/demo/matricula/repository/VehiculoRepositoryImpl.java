package com.uce.edu.demo.matricula.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matricula.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el vehiculo: "+v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo los datos del  vehiculo: "+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base de datos: " +placa);
		Vehiculo v =new Vehiculo();
		v.setMarca("KIA");
		v.setTipo("L");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(30000));
		return v;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la placa del vehiculo: "+placa);
	}

}
