import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PerroServicio list=new PerroServicio();
        list.agregarPerro();


        System.out.println("Listado de razas cargadas :");
PerroServicio.VerListado();

System.out.println("Nuevo Listado de razas cargadas :");
PerroServicio.VerListado();

}
        }

