package ativAula5;

public class ObjetoGamer {
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		
		gamer.ligar();
		gamer.reiniciar();
		gamer.carregandoSistema();
		gamer.ligar();
		
		System.out.println();
		
		Home home = new Home();
		home.ligar();
		home.reiniciar();
		home.carregandoSistema();
		home.ligar();
		
	}

}
