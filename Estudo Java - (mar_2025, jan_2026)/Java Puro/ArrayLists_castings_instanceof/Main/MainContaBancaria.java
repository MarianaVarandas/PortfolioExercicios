package ArrayLists_castings_instanceof.Main;

import ArrayLists_castings_instanceof.Classes.ContaBancaria;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(0551, 155.60);
        ContaBancaria conta2 = new ContaBancaria(5598, 55.96);
        ContaBancaria conta3 = new ContaBancaria(9586, 15698.65);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaComMaiorSaldo = listaDeContas.get(0); // taxando a primeira como maior para fazer a comparação usando uma variável

        for (ContaBancaria item : listaDeContas) {
            if (item.getSaldo() > contaComMaiorSaldo.getSaldo()) { // testando cada item pra ver se é maior
                contaComMaiorSaldo = item;
            }
                System.out.println("A conta com maior saldo é: " + contaComMaiorSaldo.getConta());


        }
    }
}