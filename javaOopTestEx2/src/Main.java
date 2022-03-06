public class Main {
    public static void main(String[] args) {
        int count = 0;
        int[][] smallArr = new int[10][10];
        int[][] bigArr = new int[40][40];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                smallArr[i][j] = count;
                count++;
            }
        }
        count = 0;
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                bigArr[i][j] = count;
                count++;
            }
        }
Func func=new Func();
        func.check(smallArr,bigArr);

    }}