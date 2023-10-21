public class Robo {
    private Comportamento comportamento;

    public Robo(){
        System.out.println("Robo esta normal");
        this.comportamento = new ComportamentoNormal();
    }

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
