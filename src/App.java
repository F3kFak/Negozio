public class App {
    public static void main(String[] args) {

        Alimentare p1 = new Alimentare(2022, 4, "pizza", 6.8, "Napoli");
        NonAlimentare pn1 = new NonAlimentare("ferro", false, "telefono", 169.69, "China");

        System.out.println(p1.isScaduto());
        System.out.println(p1.toString());
        System.out.println(p1.getPrezzo());
        p1.applicaSconto();
        System.out.println(p1.getPrezzo());
        System.out.println(p1.toString());

        System.out.println("-----");

        System.out.println(pn1.getPrezzo());
        pn1.applicaSconto();
        System.out.println(pn1.getPrezzo());

    }
}
