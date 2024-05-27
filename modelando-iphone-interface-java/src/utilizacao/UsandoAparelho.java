package utilizacao;

import equipamento.aparelhotelefonico.Telefone;
import equipamento.aparelhotelefonico.TelefoneCelular;
import equipamento.iphone.Iphone;
import equipamento.navegadorinternet.Navegador;
import equipamento.navegadorinternet.Safari;
import equipamento.reprodutormusical.Ipod;
import equipamento.reprodutormusical.Reprodutor;

public class UsandoAparelho {
    public static void main(String[] args) {
        TelefoneCelular telefone = new TelefoneCelular();
        telefone.atender();
        telefone.ligar();
        telefone.iniciarConandoVoz();

        Safari navegador = new Safari();
        navegador.exibirPagina();
        navegador.adicionarAba();
        navegador.atualizarPagina();

        Ipod ipod =  new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionar();

        Iphone iphone = new Iphone();


        iphone.ligar();
        iphone.atender();
        iphone.iniciarConandoVoz();

        iphone.adicionarAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        iphone.pausar();
        iphone.tocar();
        iphone.selecionar();

        Telefone tel = iphone;
        tel.ligar();
        Navegador nav = iphone;
        nav.atualizarPagina();
        Reprodutor rep = iphone;
        rep.pausar();

    }
}
