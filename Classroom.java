public class Classroom {
    public static void main(String[] args) {

        Wilder Damien = new Wilder("Damien", true);

        Wilder Julien = new Wilder("Julien", false);

        Wilder Bertrand = new Wilder("Bertrand", true);

        System.out.println(Damien.whoAmI());
        System.out.println(Julien.whoAmI());
        System.out.println(Bertrand.whoAmI());

    }
}