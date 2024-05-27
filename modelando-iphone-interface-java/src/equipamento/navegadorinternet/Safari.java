package equipamento.navegadorinternet;

public class Safari implements Navegador{
    public void exibirPagina () {
        System.out.println("Exibindo pagina internet no navegador");
    }
    public void adicionarAba () {
        System.out.println("Adicionando Aba no navegador");
    }
    public void atualizarPagina () {
        System.out.println("Atualizando pagina no navegador");
    }
}
