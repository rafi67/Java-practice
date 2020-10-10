package Algorithm;

public class DemoBinarySearch {
    private static void test1() {
        int[]data = {12,45,67,50,90,80};
        System.out.println(data.length);
        int num = 80;
        int lowIndex = 0;
        int highIndex = data.length;
        int midIndex;
        while(lowIndex<=highIndex){
            midIndex = (lowIndex+highIndex)/2;
            if(num==data[midIndex]){
                System.out.println(num+" found and it is the element of "+midIndex);
                break;
            }
            if(num>data[midIndex]){
                lowIndex = midIndex+1;
            }
            if(num<data[midIndex]){
                highIndex = midIndex-1;
            }
            if(lowIndex>highIndex){
                System.out.println("Number not found");
            }
        }

    }

    public static void main(String[] args) {
        test1();
    }
}
