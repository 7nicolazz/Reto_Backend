package com.entelgy.model;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"email",
"first_name",
"last_name",
"avatar"
})
public class Usuario {


	private int id;
	private String last_name;
	private String email;
	

	@JsonIgnore //Anotacion para eliminar las relaciones JSON 
	private Map<String, Object> ignorarEstructura = new HashMap<String, Object>();

	public Usuario() {
		super();
	}

	
	
	public Usuario(int id, String last_name, String email) {
		super();
		this.id = id;
		this.last_name = last_name;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@JsonAnyGetter
	public Map<String, Object> getIgnorarEstructura() {
		return ignorarEstructura;
	}

	@JsonAnySetter
	public void setIgnorarEstructura(Map<String, Object> ignorarEstructura) {
		this.ignorarEstructura = ignorarEstructura;
	}



	@JsonAnySetter
	public void setIgnorarEstructura(String id, Object value) {
	this.ignorarEstructura.put(id, value);
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	
	







}
