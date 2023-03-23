public class Main {
    public static void main(String[] args) {

        Singleton primeraInstancia = Singleton.getInsatance();

        primeraInstancia.setNombre("Primera instancia");
        primeraInstancia.setEdad(0);

        Singleton segundaInstancia = Singleton.getInsatance();

        segundaInstancia.setEdad(1);

        System.out.println(primeraInstancia.toString()); // Mirar puntero
        System.out.println(segundaInstancia.toString()); // Mirar puntero

    }
}
