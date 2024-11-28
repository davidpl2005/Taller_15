package Taller15.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("usuarioEjemplo", "password1");

        AutenticacionService autenticacionService = new AutenticacionService();
        ValidacionService validacionService = new ValidacionService();

        if (validacionService.validarContrasena(usuario.getContrasena())) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no cumple los criterios de seguridad.");
        }

        if (autenticacionService.autenticar(usuario, "usuarioEjemplo", "password123")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Error de autenticación.");
        }
    }
}
