package modelo.dao;

import modelo.javabean.Contacto;

public interface Contactodao {
    /**
     *
     * @param contacto Registra un nuevo contacto en el sistema
     * @return Devuelve true si se ha registrado correctamente y false si no
     */
    boolean altaContacto(Contacto contacto);
    /**
     *
     * @param contacto Elimina un contacto del sistema
     * @return Si lo elimina correctamente devuelve true si no false
     */
    boolean eliminarContacto(Contacto contacto);

    /**
     *
     * @param nombre Busca un contacto en la agenda
     * @return si lo encuentra devuelve un true si no false
     */
    Contacto buscarUno(String nombre);

    /**
     *
     * @param telefono Busca un telefono en la agenda
     * @return Si encuetra el telefono solicitado te devuelve un true si no un false
     */
    Contacto buscarTelefono(String telefono);

    /**
     *
     * @param email Busca un email de los contactos que hay en la agenda
     * @return devuelve true si lo encuentra y false si no lo encuetra
     */
    Contacto buscarEmail(String email);



}
