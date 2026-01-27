public class SequentialSearch {
    public static int sequentialSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        int target = 7;

        int result = sequentialSearch(arr, target);
        if (result != -1) {
            System.out.println("찾은 위치: "+result);
        } else {
            System.out.println("값을 찾지 못했습니다.");
        }
    }
}
