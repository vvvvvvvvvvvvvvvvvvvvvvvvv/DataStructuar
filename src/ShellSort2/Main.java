package ShellSort2;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[7];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.println(mas[i] + " ");
        }

        int d = mas.length / 2;
        while (d > 0){
            for (int i = 0; i < (mas.length - d); i++){
                int j = i;
                while ((j >= 0) && (mas[j] > mas[j + d])){
                    int temp = mas[j];
                    mas[j] = mas[j+d];
                    mas[j + d] = temp;
                    j--;

                }
            }
            d = d/2;
        }
        System.out.println();
        printArray(mas);


    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
