// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");
        System.out.println("hola");
        System.out.printf("hola2 seguido ");
        System.out.println("hola3");
        System.out.println("Hola 4");
        int salario = 1000;
        System.out.println("el salario es: $" +  salario );
        salario += 4000;
        System.out.println("el salario es: $" +  salario );

        // dates numeric
        int n = 1234567890;

        // dates characters
        var variable = "Hola otra vez";

        // varibles de exactitud
        double perrosMensuales = 30.0/12.0;
        System.out.println(perrosMensuales);

        //fruncar
        int pucker = (int) perrosMensuales;
        System.out.println(pucker);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        //conversion de datos
        int c = a/b;
        char n1= 1;
        int nI = n1;
        System.out.println((char) c);
        System.out.println(nI);

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 0; i <= 4; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}