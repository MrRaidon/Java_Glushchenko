package Task5;

public class Ret {
    
    int[] valuesArr;
    int[] weightArr;
    int[] rangesArr;
    int sum = 0;

    public Ret(int[] values, int[] weight) {
        valuesArr = values;
        weightArr = weight;
        rangesArr = new int[valuesArr.length];

        sum = 0;

        for (int i = 0; i < weightArr.length; i++)
            sum += weightArr[i];

        int s = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            rangesArr[i] = s;
            s += weightArr[i];
        }
    }


    public int getNumber() {
        int random = (int) (Math.random() * (sum - 1));

        int index = 0;
        for (int i = 0; i < rangesArr.length; i++) {
            if (rangesArr[i] > random)
                break;
            index = i;
        }

        return valuesArr[index];
    }
    
}
