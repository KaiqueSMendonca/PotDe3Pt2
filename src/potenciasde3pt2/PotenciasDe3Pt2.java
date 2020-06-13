package potenciasde3pt2;


public class PotenciasDe3Pt2 {


    public static void main(String[] args) {
        int i = 0;
        
        do{
            int r = (int) Math.pow(3, i);
            System.out.println(r+", ");
            i++;    
        }while (i<=15);
    }
}
