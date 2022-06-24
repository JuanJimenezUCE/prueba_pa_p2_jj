package com.uce.edu.demo.matricula.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matricula.modelo.Matricula;
import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.modelo.Vehiculo;
import com.uce.edu.demo.matricula.repository.IMatriculaRepository;
import com.uce.edu.demo.matricula.repository.IPropietarioRepository;
import com.uce.edu.demo.matricula.repository.IVehiculoRepository;
@Service
public class FachadaMatriculaServiceImpl implements IFachadaMatriculaService{
	@Autowired
	private IVehiculoRepository vehiculo;
	@Autowired
	private IPropietarioRepository propietario;   
    @Autowired
    @Qualifier("liviano")
	private IMatriculaService matriculaServiceL;
    @Autowired
    @Qualifier("pesado")
	private IMatriculaService matriculaServiceP;
    @Autowired
    private IMatriculaRepository iMatriculaRepository;
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
		BigDecimal valor;
		BigDecimal descuento;
		Propietario p=this.propietario.consultar(cedula);
		Vehiculo v = this.vehiculo.buscar(placa);
		if (v.getTipo().equals("L")) {
			
			valor = this.matriculaServiceL.calcularValor( v.getPrecio());
			
		}
		else {
			valor = this.matriculaServiceP.calcularValor( v.getPrecio());
			}
		
		if(valor.compareTo(new BigDecimal(2000))>0) {
		     descuento  = valor.multiply(new BigDecimal(7).divide(new BigDecimal(100)));
		     valor = valor.subtract(descuento);
			
		}
		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(p);
		m.setVehiculo(v);
		m.setValorMatricula(valor);
		this.iMatriculaRepository.crear(m);
	}


	
		



}
