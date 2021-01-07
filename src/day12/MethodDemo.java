package day12;

public class MethodDemo {
    public static void printArray(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7};
        MethodDemo.printArray(arr1);
        System.out.println();
        System.out.println("==========");
        MethodDemo.printArray(new int[]{5, 6, 7});
        System.out.println();
        System.out.println("===============");
        MethodDemo.printArray(1, 3, 5, 7);
    }
}

