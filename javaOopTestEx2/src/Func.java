import java.util.ArrayList;
import java.util.List;

public class Func {
    private List<Integer> smallList=new ArrayList<>();
    private List<Integer> bigList=new ArrayList<>();
    private int count = 0;
private boolean flag;
    public void check(int smallArr[][], int bigArr[][]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               smallList.add(smallArr[i][j]);
            }
        }

        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                bigList.add(bigArr[i][j]);
            }
        }
        if (bigList.containsAll(smallList))
            System.out.println("the big array contains the small array");
        else
            System.out.println("the big array does not contain the small array");


    }


    }



