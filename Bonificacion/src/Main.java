import java.util.ArrayList;
import java.util.Scanner;

class ProductoLocal {
    private String nombre;
    private int codigo;
    private String registroLocal;

    public ProductoLocal(String nombre, int codigo, String registroLocal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.registroLocal = registroLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getRegistroLocal() {
        return registroLocal;
    }
}

class ProductoExtranjero {
    private String nombre;
    private int codigo;
    private String licenciaImportacion;

    public ProductoExtranjero(String nombre, int codigo, String licenciaImportacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.licenciaImportacion = licenciaImportacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getLicenciaImportacion() {
        return licenciaImportacion;
    }
}

public class Main {
    static ArrayList<ProductoLocal> lista_ProductosLocales = new ArrayList<>();
    static ArrayList<ProductoExtranjero> lista_ProductosExtranjeros = new ArrayList<>();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu() {
        while (true) {
            System.out.print(
                    "Selecciona la acción que deseas realizar\n" +
                            "1⃣ Registrar producto Local\n" +
                            "2⃣ Registrar producto Extranjero\n" +
                            "3⃣ Revisar lista de productos Locales\n" +
                            "4⃣ Revisar lista de productos Extranjeros\n" +
                            "5⃣ Buscar producto Local\n" +
                            "6⃣ Buscar producto Extranjero\n" +
                            "7⃣ Salir\n" +
                            "Acción --> ");
            System.out.println("\n-------------------------------------");

            int eleccion = scn.nextInt();

            switch (eleccion) {
                case 1:
                    registrar_Producto_Local();
                    break;
                case 2:
                    registrar_Producto_Extranjero();
                    break;
                case 3:
                    mostrar_Productos_Locales();
                    break;
                case 4:
                    mostrar_Productos_Extranjeros();
                    break;
                case 5:
                    buscar_Producto_Local();
                    break;
                case 6:
                    buscar_Producto_Extranjero();
                    break;
                case 7:
                    scn.close();
                    return;
                default:
                    System.out.println("Opción no válida. Vuelve a intentarlo.");
            }
        }
    }

    static void registrar_Producto_Local() {
        System.out.print("\nNombre del producto:");
        String nombre = scn.next();
        System.out.print("\nCódigo del producto: ");
        int codigo = scn.nextInt();
        System.out.print("\nRegistro Local: ");
        String registroLocal = scn.next();

        lista_ProductosLocales.add(new ProductoLocal(nombre, codigo, registroLocal));
        System.out.println("Producto local registrado con éxito.");
    }

    static void registrar_Producto_Extranjero() {
        System.out.print("\nNombre del producto:");
        String nombre = scn.next();
        System.out.print("\nCódigo del producto: ");
        int codigo = scn.nextInt();
        System.out.print("\nLicencia de importación: ");
        String licencia_Importacion = scn.next();

        lista_ProductosExtranjeros.add(new ProductoExtranjero(nombre, codigo, licencia_Importacion));
        System.out.println("Producto extranjero registrado con éxito.");
    }

    static void mostrar_Productos_Locales() {
        System.out.println("Lista de productos locales: ");
        for (ProductoLocal producto : lista_ProductosLocales) {
            System.out.println("Nombre  |  Código  |  Registro Local " );
            System.out.println(producto.getNombre() + "   |   " + producto.getCodigo() + "    |     " + producto.getRegistroLocal());
            System.out.println("-------------------------------------");
        }
    }

    static void mostrar_Productos_Extranjeros() {
        System.out.println("Lista de productos extranjeros: ");
        for (ProductoExtranjero producto : lista_ProductosExtranjeros) {
            System.out.println("Nombre  |  Código  |  Licencia Importación " );
            System.out.println(producto.getNombre() +"    |   " + producto.getCodigo() + "     |     " +  producto.getLicenciaImportacion());
            System.out.println("-------------------------------------");
        }
    }

    static void buscar_Producto_Local() {
        System.out.print("Nombre del producto local a buscar: ");
        String nombre_Buscado = scn.next();
        boolean encontrado = false;

        for (ProductoLocal producto : lista_ProductosLocales) {
            if (producto.getNombre().equals(nombre_Buscado)) {
                System.out.println("Producto local encontrado con éxito:");
                System.out.println("Nombre  |  Código    |     Registro Local: " );
                System.out.println(producto.getNombre() + "  |  " + producto.getCodigo() + "    |     " + producto.getRegistroLocal());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El producto local no ha sido encontrado.");
        }
    }

    static void buscar_Producto_Extranjero() {
        System.out.print("Nombre del producto extranjero a buscar: ");
        String Buscando = scn.next();
        boolean encontrado = false;

        for (ProductoExtranjero producto : lista_ProductosExtranjeros) {
            if (producto.getNombre().equals(Buscando)) {
                System.out.println("Producto extranjero encontrado con éxito:");
                System.out.println("Nombre  |  Código    |     Licencia Importación: " );
                System.out.println(producto.getNombre() + "  |  " +  producto.getCodigo() + "    |     " + producto.getLicenciaImportacion());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El producto extranjero no ha sido encontrado.");
        }
    }
}
