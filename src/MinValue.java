public class MinValue {
    public static void main(String[] args) {
        int[] test = {8,4,6,10,7,3};
        int minIndex = 0;
        int minValue = test[0];

        for(int i = 0; i<test.length; i++){
            if(test[i] < minValue){
                minValue = test[i];
                minIndex = i;
            }
        }
        System.out.println(minValue);
    }
}
