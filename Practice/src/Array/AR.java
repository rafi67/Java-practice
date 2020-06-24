package Array;

public class AR {
    public static void main(String Rafi[]){
        int [] array = new int[5];
        for(int i=0; i<1; i++){
            array[i] = 12;
        }
        System.out.println(array[0]);
        int[][]array2 = {{1,2}, {3, 5}};

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.println(array2[i][j]);
            }
        }
        int[][]a2 = {{3,2}, {1,4}};
        System.out.println(a2[0][0]);
        System.out.println(a2[0][1]);
    }
}
