public class Calc {
    private  double x, n, res=0;
    private  int count = 1;

    private  int check;
    public Calc(int x, int n) {
        this.x = x;
        this.n = n;
    }

    public double Do() {
        for (int i = 1; i <= n; i++) {
            check=fact(i);
            if (count % 2 == 0) {
                System.out.println(res + " + (" + x + "pow " + count + " * 2) / fact(" + i + "):n");
                res = res + Math.pow(x, count * 2) / fact(i);
            } else {
                System.out.println(res + " - (" + x + "pow " + count + " * 2) / fact(" + i + "):n");

                res = res - Math.pow(x, count * 2) / fact(i);
            }
            count++;
        }
return res;
    }

    public int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
