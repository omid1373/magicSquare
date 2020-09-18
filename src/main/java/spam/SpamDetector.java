package spam;

public class SpamDetector {
    public static void main(String args[]) {         //static method
        String buffer = "ngnegeogeg6rg65--r=gr-=**/-f-w";
        char[] str =  buffer.toCharArray();
        System.out.printf("Char length : %d \nString length: %d \n", str.length ,buffer.length());
        for (int i=0 ; i < str.length; i++)
            System.out.print(str[i] + " ");
    }
}
