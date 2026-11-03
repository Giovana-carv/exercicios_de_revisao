
public class Potencia {

    
    public static long potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }
}    