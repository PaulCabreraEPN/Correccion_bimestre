import Viajes.*;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Date hoy=new Date();
        System.out.println("Objetos Quemados");
        System.out.println("1.");
        Ruta ruta=new Ruta("Paul Cabrera",1751431964,1,hoy);
        ruta.mostrar_info();

        System.out.println("\n2.");
        Servicio servicio1=new Servicio("Paul Cabrera",1751431964,1,hoy,false);
        servicio1.mostrar_info();

        System.out.println("\n3.");
        Servicio_nomal servicio2 = new Servicio_nomal("Paul Cabrera",1751431964,1,hoy,true,"Ventana",15.5,true);
        servicio2.mostrar_info();

        System.out.println("\n4.");
        Servicio_vip servicio3 = new Servicio_vip("Paul Cabrera",1751431964,1,hoy,true,15.5,true,"Television");
        servicio3.mostrar_info();

        System.out.println("\n5.");
        TICKETS_NOR Ticket1 = new TICKETS_NOR("Paul Cabrera",1751431964,1,hoy,"Ventana",15.5,true,"88888",hoy);
        Ticket1.mostrar_info();


        /*Objeto1*/
        TICKETS_VIP t1=new TICKETS_VIP();
        t1.setNombre("Tadeo Cadena");
        t1.setCedula(941077984);
        t1.setRuta(1);
        t1.setAdicionales("Internet");
        t1.setEspacio_maleta(16);
        t1.setMaleta_extra2(true);
        t1.setCodigo("2002");
        t1.setFecha_compra(hoy);
        t1.setFecha_salida(hoy);
        t1.mostrar_info();


        /*Objeto2*/
        TICKETS_NOR t2=new TICKETS_NOR();
        t2.setNombre("Adrian Herrera");
        t2.setCedula(941077984);
        t2.setRuta(3);
        t2.setAsiento("Medio");
        t2.setEspacio_maleta(16);
        t2.setCodigo("2003");
        t2.setFecha_compra(hoy);
        t2.setFecha_salida(hoy);
        t2.mostrar_info();

        /*Objeto3*/
        TICKETS_NOR t3=new TICKETS_NOR();
        t3.setNombre("Madeline Sierra");
        t3.setCedula(175986324);
        t3.setRuta(4);
        t3.setAsiento("Ventana");
        t3.setEspacio_maleta(15);
        t3.setCodigo("2004");
        t3.setFecha_compra(hoy);
        t3.setFecha_salida(hoy);
        t3.mostrar_info();

        /*Objeto4*/
        TICKETS_VIP t4=new TICKETS_VIP();
        t4.setNombre("Amaralis Gavilanes");
        t4.setCedula(148523697);
        t4.setRuta(2);
        t4.setAdicionales("Comida");
        t4.setEspacio_maleta(16);
        t4.setMaleta_extra2(true);
        t4.setCodigo("2005");
        t4.setFecha_compra(hoy);
        t4.setFecha_salida(hoy);
        t4.mostrar_info();

        /*Objeto5*/
        TICKETS_VIP t5=new TICKETS_VIP();
        t5.setNombre("Rosa Herrera");
        t5.setCedula(1720304474);
        t5.setRuta(1);
        t5.setAdicionales("Internet");
        t5.setEspacio_maleta(16);
        t5.setMaleta_extra2(true);
        t5.setCodigo("2005");
        t5.setFecha_compra(hoy);
        t5.setFecha_salida(hoy);
        t5.mostrar_info();







    }
}