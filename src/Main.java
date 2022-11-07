public class Main {
    public static void main(String[] args) {

        System.out.println("Sueldo Pepe");
        Cadete pepe = new Cadete();
        System.out.println(String.format("Sueldo total del empleado es %f",
                pepe.calcularSueldoNeto()
                ));

}
}
