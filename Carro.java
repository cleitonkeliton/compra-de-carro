/*Crie uma classe Carro com os seguintes atributos e métodos:
marca, modelo, ano (privados)*/
public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    //Construtor para inicializar os atributos
    public Carro(String marca,String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    //Métodos getters e setters
    public String getMarca(){return marca;}
    public void setMarca (String marca) {this.marca=marca;}

    public String getModelo(){return modelo;}
    public void setModelo (String modelo){ this.modelo=modelo;}

    public int getAno(){return ano;}
    public void setAno(int ano){this.ano=ano;}


    // Método para exibir informações do carro
    public void exibirInfo (){
        System.out.println(" carro " + marca +" "+ modelo + " " + "-" + ano + " ) ");
    }

    /*Método que simula a compra de um carro e lança uma exceção personalizada
    caso o ano do carro seja inferior a 2000.*/
    public void comprarCarro ()throws CarrosAntigosExclusao{
        if (this.ano<2000){
            throw new CarrosAntigosExclusao("compra não realizada, ano de fabricação inferior á 2000. Carro: "+ marca + modelo + "-"+ ano);
        }
        System.out.println("compra realizada com sucesso "+ marca + " "+ modelo+" "+ "-"+ano);
    }
}
