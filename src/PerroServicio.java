import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicio {
    String raza;
    String fin;

    static String buscar;


    private static ArrayList<String> ListaPerros;

    public PerroServicio(String raza, String fin, ArrayList<String> listaPerros) {
        this.raza = raza;
        this.fin = fin;
        ListaPerros = listaPerros;
    }

    public PerroServicio() {
        this.ListaPerros = new ArrayList<>();
    }

    public ArrayList<String> agregarPerro() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese la raza del perro: ");
            raza = sc.next();
            ListaPerros.add(raza);

            System.out.print("Si desea adicionar otro perro a la lista, ingrese Si, de lo contrario digite cualquier tecla: ");
            fin = sc.next();

        } while (fin.equalsIgnoreCase("Si"));
        return ListaPerros;

    }

    public static void VerListado() {
        Collections.sort(ListaPerros);
        for (String p : ListaPerros) {
            System.out.println(p);
        }

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la raza que quiere buscar en la lista: ");
            buscar = sc.next();
            Iterator<String> iterador = ListaPerros.iterator();
            while (iterador.hasNext()) {
                String raza1 = iterador.next();
                if (raza1.equalsIgnoreCase(buscar)) {
                    iterador.remove();
                    Collections.sort(ListaPerros);

                }
                    }

                }
            }












