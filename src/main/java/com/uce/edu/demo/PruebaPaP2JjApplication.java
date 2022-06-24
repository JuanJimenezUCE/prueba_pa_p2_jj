package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matricula.modelo.Matricula;
import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.modelo.Vehiculo;
import com.uce.edu.demo.matricula.service.IFachadaMatriculaService;
import com.uce.edu.demo.matricula.service.IMatriculaService;
import com.uce.edu.demo.matricula.service.IPropietarioService;
import com.uce.edu.demo.matricula.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2JjApplication implements CommandLineRunner{
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService matricula;
	
	@Autowired
	private IFachadaMatriculaService iFachadaMatriculaService;
	@Autowired
	private IVehiculoService vehiculo;
	@Autowired
	private IPropietarioService propietario;
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		Vehiculo v=new Vehiculo();
		v.setMarca("totota");
		v.setPlaca("PCT8976");
		v.setPrecio(new BigDecimal(50000));
		v.setTipo("L");
		this.vehiculo.ingresar(v);
		
		v.setPlaca("PDM4185");
		v.setMarca("Toyota");
		this.vehiculo.actualizar(v);
		
		Propietario p = new Propietario();
		p.setApellido("Jimenez");
		p.setCedula("1723026900");
		p.setFecha(LocalDateTime.now());
		p.setNombre("Juan");
		this.propietario.ingresar(p);
		
		this.iFachadaMatriculaService.generar("1723026900", "PDM4185");
		
		
	
	}

}
