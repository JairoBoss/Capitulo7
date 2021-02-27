package GameZone3;

import java.util.Scanner;

public class Usuario {
    private Scanner sc;
    private char letra;
    private Integer opcion;

    public Usuario(){
        this.sc = new Scanner(System.in);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Integer getOpcion() {
        return opcion;
    }

    public void setOpcion(Integer opcion) {
        this.opcion = opcion;
    }

}
