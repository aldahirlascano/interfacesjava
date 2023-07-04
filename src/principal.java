public class principal {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch ( Exception e){
            //caso contrario, si no se cumple
            //Exception es obligatorio, e solo es una variable
            //exception captura el mensaje erroneo y lo almacena en la variable

            System.out.println("Algo resulto erroneo");
            System.out.println(e);
        }
        finally {
            System.out.println("De todas formas voy a mostrar este mensaje");
        }
    }
}