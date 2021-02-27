package GameZone2;

import java.util.Scanner;

public class RockPaperScissors {
    private Scanner sc;
    private String jugador;
    private Integer pc;
    private String PCO;

    public RockPaperScissors(){
        this.sc = new Scanner(System.in);
        this.jugador = "a";
        this.pc = (int)(Math.random()*3+1);
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public void castPC(){
        switch (this.pc){
            case 1:
                this.PCO = "Piedra";
            break;
            case 2:
                this.PCO = "Papel";
            break;
            case 3:
                this.PCO = "Tijeras";
            break;
        }

    }

    public Integer getPc() {
        return pc;
    }

    public void setPc(Integer pc) {
        this.pc = pc;
    }

    public String getPCO() {
        return PCO;
    }

    public void setPCO(String PCO) {
        this.PCO = PCO;
    }

    public void jugar(){
        System.out.println("Escoje una");
        System.out.println("[1]Piedra [2]Papel [3]Tijeras");
        castPC();
        System.out.println(this.PCO);
        this.jugador = sc.nextLine();


        if (this.jugador == this.PCO) {
            System.out.println("Empate");
        } else if ((this.jugador == "Piedra" && this.PCO == "Tijeras") ||(this.jugador == "Papel" && this.PCO == "Piedra") ||(this.jugador == "Tijeras" && this.PCO == "Papel")  ){
            System.out.println("Ganas");

        } else if ((this.jugador == "Piedra" && this.PCO == "Papel") || (this.jugador == "Tijera" && this.PCO =="Tijeras") || (this.jugador == "Tijera" && this.PCO == "Piedra")){
            System.out.println("Pierdes");
        }
    }
}
