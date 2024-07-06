public class Fibb {
    public static void main(String[] args) {
        int x = 0, y = 9, z;
        System.out.println(x);
        System.out.println(y);
        for (int i = 1; i < 6; i++) {
            z = x+y;
            x = y;
            y = z;
            System.out.println(z);
        }
        
    }
}
