package omid;

public class Main {

    public static void main(String args[]) {         //static method
        System.out.println("omid Main ssss...");
        try {
            for(int i = 0 ; i < 6 ; i++){
                System.out.println("Magic square of size "+(2*i+1)+" :");
                MagicSquare ms = new MagicSquare((2*i+1));
                ms.show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
