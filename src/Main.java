public class Main {

    public static void main(String[] args) {
        String[] myArray = {"nie wiem", "czy o takie", "wypelnienie", "danymi", "chodzilo", "ale", "mysle", "ze bedzie", "dobrze"};

        System.out.println("LEGENDA: [Indeks elementu] - Wartosc ");
        int i = 0;
        while(i<myArray.length) {
            System.out.println("["+i+"] - " + myArray[i]);
            i++;
        }
    }
}

