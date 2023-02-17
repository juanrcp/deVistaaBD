package edu.deVistaaBD.aplicacion.dal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO donde creamos la clase Usuarios
@Entity
@Table(name="usuarios_prueba", schema="usuarios")
public class Usuarios {

	@Id
	//ID autogenerado
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_usuario") 
	private long id;
	
	@Column(name="usu_nombre", nullable = false)
	private String nombre;
	
	@Column(name="usu_apellidos", nullable = false)
	private String apellidos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	//Constructores
	public Usuarios(long id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Usuarios(String nombre, String apellidos) {
		super();
		this.id = this.id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Usuarios() {
		super();
	}
	
	
}
