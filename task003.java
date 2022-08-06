import java.util.Random;

public class task003 {
    public static void main(String[] args) {
        int [] nata = new int[10];
        for (int msa= 0;msa<nata.length;msa++){
            Random rnd = new Random();
            nata [msa] = rnd.nextInt(10)+1;
        }
        for (int msa= 0;msa<nata.length;msa++){
            System.out.println(nata[msa]);
        }
    }
}
