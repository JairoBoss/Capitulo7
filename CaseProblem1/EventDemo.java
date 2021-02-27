package CaseProblem1;

import java.util.Locale;
import java.util.Scanner;

public class EventDemo {
    Scanner sc = new Scanner(System.in);
    private final static Integer precioInvitado = 35;
    private final static Integer granEvento = 50;
    private String evento;
    private Integer numeroDeInvitados;
    private  Integer costo;
    private String numeroDeTelefono;

    public EventDemo(){
        this.evento = sc.nextLine();
        this.evento = this.evento.toUpperCase();
    }

    public void setNumeroDeTelefono(){
        System.out.println("Introdusca su numero celular");
        this.numeroDeTelefono = sc.nextLine();
        this.numeroDeTelefono = this.numeroDeTelefono.replace('(', '\0');
        this.numeroDeTelefono = this.numeroDeTelefono.replace(')', '\0');
        this.numeroDeTelefono = this.numeroDeTelefono.replace('-', '\0');
        this.numeroDeTelefono = this.numeroDeTelefono.replace(' ', '\0');
        this.numeroDeTelefono = this.numeroDeTelefono.replaceAll("\0", "");
        if (this.numeroDeTelefono.length()!=10) {
            this.numeroDeTelefono = "0000000000";
        }
    }

    public String getNumeroDeTelefono(){
        contruir();
        return this.numeroDeTelefono;
    }

    private void contruir(){
        StringBuilder cel = new StringBuilder(this.numeroDeTelefono);
        cel.insert(0,"(");
        cel.insert(4,")");
        cel.insert(5," ");
        cel.insert(9,"-");
        this.numeroDeTelefono = cel.toString();
    }

    @Override
    public String toString() {
        return "EventDemo{" +
                "sc=" + sc +
                ", evento='" + evento + '\'' +
                ", numeroDeInvitados=" + numeroDeInvitados +
                ", costo=" + costo +
                ", numeroDeTelefono='" + numeroDeTelefono + '\'' +
                '}';
    }

    public void solicitarElemento(){
        do {
            System.out.println("Ingrese el numero de invitados");
            System.out.println("Recuerda que debe de estar entre 50 y 100");
            this.numeroDeInvitados = sc.nextInt();
        }while(this.numeroDeInvitados > 101 || this.numeroDeInvitados < 5 );
    }

    public void invitacion(){
        for (int i = 0; i < this.numeroDeInvitados; i++) {
            System.out.println("¡Por favor, ven a mi evento!");
        }
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getNumeroDeInvitados() {
        return numeroDeInvitados;
    }

    public void setNumeroDeInvitados(Integer numeroDeInvitados) {
        this.numeroDeInvitados = numeroDeInvitados;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }
}
