package testing;

import java.util.ArrayList;

import modelo.dao.AgendaContactosDaoImplArray;
import modelo.javabean.Contacto;

public class TestAgenda {

    private static AgendaContactosDaoImplArray agenda;

    static{
        agenda = new AgendaContactosDaoImplArray("mis amigos");
    }

    public static void main(String[] args) {

        uno();
        todos();
        email();
        eliminarContacto();
    }

    private static void uno() {
        agenda.altaContacto(new Contacto("Giuseppe", "Alberico", "645326078", "miticogiuseppe@gmail.com", "Atos"));

        Contacto contactoEncontrado = agenda.buscarUno("Giuseppe");
        System.out.println(contactoEncontrado);

    }
    private static void todos() {

        Contacto contactoEncontrado = agenda.buscarTelefono("645326078");
        System.out.println(contactoEncontrado);

    }

    private static void email() {

        Contacto contactoEncontrado = agenda.buscarEmail("miticogiuseppe@gmail.com");
        System.out.println(contactoEncontrado);

    }


    private static void eliminarContacto() {
        agenda.eliminarContacto(new Contacto("Giuseppe", "Alberico", "645326078", "miticogiuseppe@gmail.com", "Atos"));
        Contacto contactoEncontrado = agenda.buscarUno("Giuseppe");
        System.out.println(contactoEncontrado);


    }

    private static void alta() {
        ArrayList<Contacto> empresas = agenda.contactosPorEmpresa("Atos");
        for (Contacto contacto : empresas) {
            System.out.println(contacto);
        }

    }
}



