public class BicarySearch {
    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("찾은 위치: "+result);
        } else {
            System.out.println("값을 찾지 못했습니다.");
        }
    }
    
}
