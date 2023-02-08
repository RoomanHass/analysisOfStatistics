import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       long[] discount = {5, 10, 15};

        SalesManager SalesManager = new SalesManager(discount);
        System.out.println(SalesManager.max());
    }
}