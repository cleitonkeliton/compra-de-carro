import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Lista de carros
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("chevrolet", "prisma", 2014));
        carros.add(new Carro("toyota", "corola", 2023));
        carros.add(new Carro("fiat", "siena", 2010));

       /*Bloco ultilizado como teste
       Carro carro1 = new Carro("Volkswagen", "Voyage", 2014);
        carro1.exibirInfo();

        Eletrico tesla = new Eletrico("tesla", "tesla", 2025, 24);
        tesla.exibirInfo();*/

        //Ordenar por ANO de fabricação
        Collections.sort(carros, Comparator.comparingInt(Carro::getAno));
        //imprimir os carros na ordem de data
        /*System.out.println("Ano de fabricação");
        for (Carro carro : carros){
            carro.exibirInfo();*/
        // Simulando a compra de carros
        for (Carro carro : carros) {
            try {
                carro.comprarCarro(); // Tenta comprar o carro
            } catch (CarrosAntigosExclusao e) {
                System.out.println("Erro: " + e.getMessage()); // Exibe a mensagem da exceção se o ano for inferior a 2000
            }
        }
    }
}