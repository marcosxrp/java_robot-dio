public class tests {
    public static void main(String[] args) {
        Comportamento calmo = new ComportamentoCalmo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.mover();
        robo.setComportamento(calmo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
