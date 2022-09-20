package leetCode;

public class SumOfDigit {
    public static int subtractProductAndSum(int n) {
        int temp = n,rem;

        int product = 1, sum=0;


        while (temp !=0){

            rem = temp %10;
            product = product*rem;
            sum = sum +rem;
            temp = temp/10;

        }
        //System.out.println(product + " " + sum);

        return product-sum;

    }
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}
