package test;


public class AppUtilidad {
    public static void main(String[] args) throws Exception {

        String encriptado = Utilidades.Encriptar("Tqc@1234");
        System.out.println(encriptado);
        String desencriptado = Utilidades.Desencriptar("9Pa4ds07XiOV7kTyPwz3gA==");
        System.out.println(desencriptado);

    }
}