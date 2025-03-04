public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglito = {1, -3, 4, 5, -18, - 5, 7, 9, 10};

        int maximoChiquito = 0;
        int maximoGrande = 0;

        for (int i : arreglito) {
            if (maximoChiquito + i > i) {

                maximoChiquito += i; 
            }
            else{
                maximoChiquito = i;
            }

            if (maximoChiquito > maximoGrande) {

                maximoGrande = maximoChiquito;
            }
            
        }
        System.out.println(maximoGrande);
    }
}
