//Classe Herança
public class Eletrico extends Carro{
    private int bateria;

    public Eletrico(String carro, String modelo, int ano, int bateria) {
        super(carro, modelo, ano);
    }
    //getter e setter
    public int getBateria(){return bateria;}
    public void setBateria(int bateria){this.bateria=bateria;}

    @Override
    public void exibirInfo (){
        super.exibirInfo();
        System.out.println("Bateria:"+ bateria +"%");
    }

}
