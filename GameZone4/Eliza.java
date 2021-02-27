package GameZone4;

public class Eliza {
    private String respuesta;
    private Paciente paciente;

    public Eliza(Paciente paciente) {

        this.paciente = paciente;
    }

    public void interactuar(){
        do {
            if (!paciente.getFrase().equalsIgnoreCase("adios")){
                if (paciente.getFrase().contains("mi")){
                    System.out.println("Cuenta mas de eso");
                }else if (this.paciente.getFrase().contains("amor") || this.paciente.getFrase().contains("odio")){
                    System.out.println("Parece que tiene fuertes sentimientos al respecto");
                }else{
                    System.out.println("Continue, Digame mas, continue");
                }
                this.paciente.setFrase();
            }
        }while (!this.paciente.getFrase().contains("adios"));
    }


}
