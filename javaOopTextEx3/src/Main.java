public class Main {
    public static void main(String[] args) {
        int num1=5;
        int num2=3;
Thread plus=new Thread(new Plus(num1,num2));
Thread minus=new Thread(new Minus(num1,num2));
Thread multi=new Thread(new Multi(num1,num2));
Thread div= new Thread(new Div(num1,num2));

plus.start();
minus.start();
multi.start();
div.start();

        try {
            plus.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            minus.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            multi.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            div.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
