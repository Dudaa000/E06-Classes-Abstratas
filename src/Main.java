import java.util.Date;

public class Main {
    public static void main(String[] args) {

        PessoaFisica joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 36, 'm');
        PessoaFisica maria = new PessoaFisica("Maria Eduarda", "Av. Carlos Luz, 7755",
                new Date(), "222.222.222-22", 16, 'f');
        PessoaJuridica lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                new Date(), "000.00000.0000/0001", 25, "Comércio");


        System.out.println(joao.toString());
        System.out.println(maria.toString());
        System.out.println(lojinha.toString());


        joao.depositar(3000);
        maria.depositar(20000);
        lojinha.depositar(3000);

        joao.sacar(2000);
        maria.sacar(1700);
        lojinha.sacar(980);

        joao.imprimirExtrato();
        maria.imprimirExtrato();

        System.out.println(joao.autenticar(maria.getCpf()));


        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);
    }
}