package com.uce.edu.demo.matricula.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matricula.modelo.Propietario;
import com.uce.edu.demo.matricula.modelo.Vehiculo;
import com.uce.edu.demo.matricula.repository.IMatriculaRepository;
import com.uce.edu.demo.matricula.repository.IVehiculoRepository;
@Service
public class FachadaMatriculaServiceImpl implements IFachadaMatriculaService{
	@Autowired
	private IVehiculoRepository vehiculo;
	
    @Autowired
	private IMatriculaRepository matriculaRepository;
    @Autowired
    @Qualifier("liviano")
	private IMatriculaService matriculaServiceL;
    @Autowired
    @Qualifier("pesado")
	private IMatriculaService matriculaServiceP;
	@Override
	public void crear(Propietario cedula, Vehiculo placa) {
		// TODO Auto-generated method stub
		this.matriculaRepository.crear(cedula, placa);
	}
	@Override
	public BigDecimal calcularValor(String placa) {
		// TODO Auto-generated method stub
		
		BigDecimal valor= null;
		Vehiculo v = this.vehiculo.buscar(placa);
		if (v.getTipo().equals("L")) {
			// Ahorros
			valor = this.matriculaServiceL.calcularValor(valor, v.getPrecio());
			
		}
		else {
			valor = this.matriculaServiceP.calcularValor(valor, v.getPrecio());
			}
		
			

		return valor;
	

	}
		



}
