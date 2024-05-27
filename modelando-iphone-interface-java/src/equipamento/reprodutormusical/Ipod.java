package equipamento.reprodutormusical;

public class Ipod implements Reprodutor{
    public void tocar () {
        System.out.println("Tocando musica no IPOD");
    }
    public void pausar () {
        System.out.println("Pausando musica no IPOD");
    }
    public void selecionar () {
        System.out.println("Selecionando musica no IPOD");
    }

}
