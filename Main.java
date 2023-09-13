import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Ingrese su día de nacimiento: ");
        int diaN = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mesN = scanner.nextInt();

        System.out.print("Ingrese su año de nacimiento: ");
        int anioN = scanner.nextInt();

        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese su peso (en kilogramos): ");
        double peso = scanner.nextDouble();
        
        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, diaN, mesN, anioN, altura, peso);
        
        System.out.println("Información del Perfil Médico:");
        System.out.println("Nombre: " + perfil.getNombre());
        System.out.println("Apellido: " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Fecha de Nacimiento: " + perfil.getDiaN() + "/" + perfil.getMesN() + "/" + perfil.getAnioN());
        System.out.println("Edad: " + perfil.getEdad() + " años");
        System.out.println("Altura: " + perfil.getAltura() + " metros");
        System.out.println("Peso: " + perfil.getPeso() + " kilogramos");
        System.out.println("Frecuencia Cardiaca Máxima Estimada: " + perfil.getFrecuenciaCardiaca() + " bpm");
        System.out.println("Índice de Masa Corporal (IMC): " + perfil.getIMC());
    }
    
}
