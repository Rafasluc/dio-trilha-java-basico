import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO:Conchecer e importar a classe Scanner
       Scanner sc1 = new Scanner(System.in);
       Scanner sc2 = new Scanner(System.in);
       Scanner sc3 = new Scanner(System.in);
       Scanner sc4 = new Scanner(System.in);
       
       //Exibir mensagens para o  usuário

        System.out.println("Por favor, digite o seu nome");
        String nome =  sc1.nextLine();

        System.out.println("Por favor, digite a sua agência !");
        String agencia =  sc2.nextLine();

        System.out.println("Por favor, digite o número da Sua conta !");
        int conta =  sc3.nextInt();

        System.out.println("Por favor, digite o seu Saldo !");
        Double saldo =  sc4.nextDouble();

       //Obter pela classe Scanner os valores digitados no terminal

       //Exibir a mensagem conta criada
       System.out.println("olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
