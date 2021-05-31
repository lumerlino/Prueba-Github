package com.unla.PruebaGithub.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="perfil")
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_perfil;
	
	@Column(name="tipo_perfil", unique=true, nullable=false, length=45)
	private String tipo_perfil;
	
	@Column(name = "enabled", columnDefinition = "boolean default true")
	private boolean enabled;

	@Column(name = "createdat", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "updatedat", nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	
	public Perfil() {}
	

	public Perfil(int id_perfil, String tipo_perfil, boolean enabled) {
		super();
		this.id_perfil = id_perfil;
		this.tipo_perfil = tipo_perfil;
		this.enabled = enabled;
	}
	
	public Perfil(String tipo_perfil) {
		super();
		this.tipo_perfil = tipo_perfil;
	}
	
	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getTipo_perfil() {
		return tipo_perfil;
	}

	public void setTipo_perfil(String tipo_perfil) {
		this.tipo_perfil = tipo_perfil;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
