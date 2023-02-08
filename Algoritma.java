package algoritma;
public class Algoritma {

    public static void main(String[] args) {
        int a = 5;
        for (int x = 1; x <=a; x++){
             for (int y = a; y > x; y--){
                  System.out.print(" ");
             }
             for(int z = 1; z <= x; z++){
                 System.out.print("*");
             }
            System.out.println();
             }

        }
    }  

