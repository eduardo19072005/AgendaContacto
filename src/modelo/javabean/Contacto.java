package modelo.javabean;

import java.util.Objects;

public class Contacto {

    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;
    /**

     * @param nombre Nombre del contacto.
     * @param apellidos Apellido del contacto.
     * @param telefono Número de telefono del contacto.
     * @param email Email del contacto.
     * @param empresa Empresa del contacto.
     */

    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, email, empresa, nombre, telefono);
    }
    /**
     * @param obj Compara dos objetos para determinar si son iguales.
     * @return Devuelve true si son iguales y falso si no lo son.
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        return Objects.equals(apellidos, other.apellidos) && Objects.equals(email, other.email)
                && Objects.equals(empresa, other.empresa) && Objects.equals(nombre, other.nombre)
                && Objects.equals(telefono, other.telefono);
    }
	/**
	*Este metodo genera una cadena con la informacion de un determinado contacto
	*@return este metodo devuelve la informacion de un contacto en especifico
	*/
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email
                + ", empresa=" + empresa + "]";
    }


}
