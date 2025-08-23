import java.util.Date;

class Contacto {
    String nombre;
    String direccion;
    String telefono;

    public Contacto(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " | " + direccion + " | " + telefono;
    }
}

public class DataTypeExamples {
    public static Integer ejemploPrimitivo() {
        return 42; // int convertido a Integer (wrapper)
    }

    public static String ejemploCadena() {
        return "Hola desde DataTypeExamples";
    }

    public static Date ejemploFecha() {
        return new Date();
    }

    public static Contacto ejemploContacto() {
        return new Contacto("Juan Pérez", "Calle Falsa 123", "555-1234");
    }
}
