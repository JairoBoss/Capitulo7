package GameZone4;

import java.util.Scanner;

public class Paciente {
    Scanner sc;
    private String frase;

    public Paciente(){
        sc = new Scanner(System.in);
        setFrase();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase() {
        this.frase = sc.nextLine();
    }
}
