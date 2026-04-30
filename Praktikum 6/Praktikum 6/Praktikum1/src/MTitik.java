public class MTitik {
    public static void main(String[] args) throws Exception {
        Titik t1 = new Titik();
        t1.setAbsis(2);
        t1.setOrdinat(3);
        t1.printTitik();

        Titik t2 = new Titik();
        t2.setAbsis(5);
        t2.setOrdinat(7);
        t2.printTitik();

        t1.geser(1, 1);
        System.out.println("Setelah digeser:");
        t1.printTitik();
    }
}
