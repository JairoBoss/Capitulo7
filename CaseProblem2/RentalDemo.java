package CaseProblem2;

public class RentalDemo {
    public static void main(String[] args) {
        Rental renta = new Rental(600,"A111");
        renta.setNoTelefono("9208729182");
        System.out.println(renta.getNoTelefono());
        System.out.println(renta.getNoContrato());
    }

}
