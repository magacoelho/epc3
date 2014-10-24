package es.upm.miw.patrones.models.entities;

public class User {
   private Integer id;
   private String nombre;
   private String apellido;
   public User() {
	// TODO Auto-generated constructor stub
}
private User(Integer id, String nombre, String apellido) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
}
protected Integer getId() {
	return id;
}
protected void setId(Integer id) {
	this.id = id;
}
protected String getNombre() {
	return nombre;
}
protected void setNombre(String nombre) {
	this.nombre = nombre;
}
protected String getApellido() {
	return apellido;
}
protected void setApellido(String apellido) {
	this.apellido = apellido;
}
     
}
