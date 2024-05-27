package equipamento.iphone;

import equipamento.aparelhotelefonico.Telefone;
import equipamento.navegadorinternet.Navegador;
import equipamento.reprodutormusical.Reprodutor;

public class Iphone implements Telefone, Navegador, Reprodutor {
    public void ligar () {
        System.out.println("Fazendo ligação do Iphone");
    }
    public void atender () {
        System.out.println("Atendendo ligação do Iphone");
    }
    public void iniciarConandoVoz () {
        System.out.println("Iniciando Comando Voz no Iphone");
    }
    public void exibirPagina() {
        System.out.println("Exibindo pagina internet no Iphone");
    }
    public void adicionarAba() {
        System.out.println("Adicionando Aba no Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Iphone");
    }
    public void tocar() {
        System.out.println("Tocando musica no Iphone");
    }
    public void pausar() {
        System.out.println("Pausando musica no Iphone");
    }
    public void selecionar() {
        System.out.println("Selecionando musica no Iphone");
    }
}
