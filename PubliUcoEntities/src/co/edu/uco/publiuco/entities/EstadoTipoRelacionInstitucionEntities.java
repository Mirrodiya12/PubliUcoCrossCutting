package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoTipoRelacionInstitucionEntities {

	private static final EstadoTipoRelacionInstitucionEntities DEFAULT_OBJECT = new EstadoTipoRelacionInstitucionEntities();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private EstadoTipoRelacionInstitucionEntities() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
	}
	
	
	public EstadoTipoRelacionInstitucionEntities(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final EstadoTipoRelacionInstitucionEntities createWhitIdentificador (final UUID identificador) {
		return new EstadoTipoRelacionInstitucionEntities(identificador, UtilText.getUtilText().getDefaultValue());
	}
	
	public static final EstadoTipoRelacionInstitucionEntities createWhitNombre (final String nombre) {
		return new EstadoTipoRelacionInstitucionEntities(nombre, UtilText.getUtilText().getDefaultValue());
	}
	
	
	
	public static EstadoTipoRelacionInstitucionEntities getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	private final void setNombre(final String nombre) {
		
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}

	
	
}
