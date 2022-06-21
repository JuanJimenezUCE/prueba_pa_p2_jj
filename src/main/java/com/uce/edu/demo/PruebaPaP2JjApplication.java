package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matricula.modelo.Vehiculo;
import com.uce.edu.demo.matricula.service.IMatriculaService;
import com.uce.edu.demo.matricula.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2JjApplication implements CommandLineRunner{

	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	private IVehiculoService vehiculo;
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo v = new Vehiculo();
				v.setMarca(null);
		v.setPlaca(null);
		v.setPrecio(null);
		v.setTipo("L");
		
		this.vehiculo.actualizar(v);
		
	}

}
