package B3_BT_Xay_Dung_Lop_Stop_Watch;

import java.time.LocalDateTime;
import java.util.Scanner;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = LocalDateTime.now();
    }
    public void stop(){
        this.endTime=LocalDateTime.now();
    }

    public int getElapse() {
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;

    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        int size;
        StopWatch st = new StopWatch();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 size : ");
        size = sc.nextInt();
        arr = creatArr(arr, size);
        st.start();
        arr = sort(arr, size);
        st.stop();
        System.out.println(st.getElapse());
        displayArr(arr, size);

    }

    public static int[] creatArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }

    public static void displayArr(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] sort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}