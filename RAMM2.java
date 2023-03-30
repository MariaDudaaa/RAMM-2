import java.util.Scanner;

public class RAMM2{
    public static void main(String[] args) {
        try{
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        System.out.println("O numero é: "+ num);
        sc.close();
        } catch(Exception e){
            int num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Número Inválido ");
            System.out.println("Digite um número: ");
            num2 = sc.nextInt();
            System.out.println("O número é: "+num2);

        }
        
        
    }
}
