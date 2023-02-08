public class Main {
    public static void main(String[] args) {

        long[] discount = {5, 10, 15, 8, 21, 3, 14};

        SalesManager SalesManager = new SalesManager(discount);
        System.out.println(SalesManager.max());
        System.out.println(SalesManager.stat());
    }
}