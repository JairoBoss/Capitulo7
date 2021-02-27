package GameZone4;

public class Test {
    public static void main(String[] args) {
        Paciente jairo = new Paciente();
        Eliza a = new Eliza(jairo);
        a.interactuar();
    }
}
