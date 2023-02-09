public class SalesManager {

    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sal : sales) {
            if (sal < min) {
                min = sal;
            }
        }
        return min;
    }

    public long stat() {
        long nums = 0;
        for (int i = 0; i < sales.length; i++) {
            nums += sales[i];
        }
        nums = (nums - max() - min()) / (sales.length - 2);
        return nums;
    }
}
