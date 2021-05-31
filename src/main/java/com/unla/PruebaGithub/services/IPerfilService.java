package com.unla.PruebaGithub.services;

import java.util.List;
import java.util.Optional;

import com.unla.PruebaGithub.entities.Perfil;



public interface IPerfilService {
	
	public List<Perfil> listar();
	public Optional<Perfil> listarId(int id);
	public int save(Perfil p);
	//public DegreeModel insertOrUpdate(DegreeModel degreeModel);
	public void delete (int id);

}
