public class EscapeSequence {
    public static void main(String[] args){
        for(int i=0; i<8; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<4; i++) {
            System.out.printf("%s %6s \n","*","*");
        }
        for(int i=0; i<8; i++){
            System.out.print("*");
        }
    }
}
