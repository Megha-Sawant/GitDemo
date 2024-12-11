package MainPackage.PractJavaProg;

public class ArrayExploration {

    public static void main(String[] arg) {
        int[] num = {2, 3, 7, 9, 1,};
        int ln = num.length;
        int tmpArr[] = new int[5];
        int j = 0;

        System.out.println("First Element of Array is" + num[j]);
        System.out.println("First Element of Array is" + num[ln]);
        for (int i = ln; i < 0; i++) {
            tmpArr[j] = num[i];
        }


    }
}
