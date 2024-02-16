package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AgendaContactosDaoImplArray {

    private ArrayList <Contacto> lista;
    private String nombreAgenda;

    public AgendaContactosDaoImplArray( String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
        lista= new ArrayList<Contacto>();
        cargarDatos();
    }

    private void cargarDatos() {
        lista.add(new Contacto("Giuseppe", "Alberico", "645326078", "miticogiuseppe@gmail.com", "Atos"));
        lista.add(new Contacto("Lukas", "Pukas", "625346958", "pukitas@gmail.com", "Microsoft"));
        lista.add(new Contacto("Tomás", "Escudero", "635225062", "tomasin@gmail.com", "IFP"));


    }

    /**
     *
     * @param contacto Registra un nuevo contacto en el sistema
     * @return Devuelve true si se ha registrado correctamente y false si no
     */
    public boolean altaContacto(Contacto contacto ) {
        if(lista.contains(contacto)) {
            return false;
        }
        lista.add(contacto);
        return true;
    }
    /**
     *
     * @param contacto Elimina un contacto del sistema
     * @return Si lo elimina correctamente devuelve true si no false
     */
    public boolean eliminarContacto(Contacto contacto) {
        return lista.remove(contacto);
    }
    /**
     *
     * @param nombre Busca un contacto en la agenda
     * @return si lo encuentra devuelve un true si no false
     */
    public Contacto buscarUno(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }
    /**
     *
     * @param telefono Busca un telefono en la agenda
     * @return Si encuetra el telefono solicitado te devuelve un true si no un false
     */
    public Contacto buscarTelefono(String telefono) {
        for (Contacto contacto : lista) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }
    /**
     *
     * @param email Busca un email de los contactos que hay en la agenda
     * @return devuelve true si lo encuentra y false si no lo encuetra
     */
    public Contacto buscarEmail(String email) {
        for (Contacto contacto : lista) {
            if (contacto.getEmail().equals(email)) {
                return contacto;
            }
        }
        return null;
    }

    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        ArrayList<Contacto> encontrados = new ArrayList<>();
        for (Contacto contacto : lista) {
            if (contacto.getNombre().startsWith(nombre)) {
                encontrados.add(contacto);
            }
        }
        return encontrados;
    }
    public boolean cambiarDatos(Contacto contacto) {
        int index = lista.indexOf(contacto);
        if (index != -1) {
            lista.set(index, contacto);
            return true;
        }
        return false;
    }

    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> encontrados = new ArrayList<>();
        for (Contacto contacto : lista) {
            if (contacto.getEmpresa().equals(empresa)) {
                encontrados.add(contacto);
            }
        }
        return encontrados;
    }

    public void exportarContactos(String nombreFichero) {

    }

    public void importarContactos(String nombreFichero) {

    }

}


