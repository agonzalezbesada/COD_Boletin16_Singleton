public class Singleton {

    /**
     * Constructor bloqueado con private
     */
    private Singleton() {

    }

    // Instancia única
    private static Singleton instance = null;

    /**
     * Crea o no el objeto dependiendo de si ya fue instanciado
     * @return la instancia. Si no existe, crea el objeto
     */
    public static Singleton getInsatance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
