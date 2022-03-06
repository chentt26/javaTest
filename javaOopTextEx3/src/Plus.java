public class Plus implements Runnable{
private double num1,num2,answer;

    public Plus(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        answer=num1+num2;
        System.out.println(num1+" + "+num2+" = "+ answer);
    }
}
