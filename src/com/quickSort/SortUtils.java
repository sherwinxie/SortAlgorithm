package com.quickSort;

public class SortUtils {

    public static void qucikSort(int[] arr, int left, int right) {
        /***
         *  arr[left ...  right]
         *  left大于等于right时退出
         */
        if (left>=right){ return; }
        int pivot = arr[left];//pivot初值为arr[0]
        int i = left,j = right;
        while (i<j){

            //j左移 比p大就--  找到一个比p小的索引  和i交换  i和j索引相等时退出
            while (arr[j]>=pivot && i<j) {
                j--;
            }
            //i右→_→移  比p小就++  找到一个比p大的索引  和j交换
            while (arr[i]<=pivot && i<j) {
                i++;
            }
            //i小于j 交换
            if (i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }//end while


        arr[left]=arr[i];//基准点重回左边
        arr[i]=pivot;//pivot给arr[i] arr[i]为中间值

        qucikSort(arr,left,i-1);
        qucikSort(arr,i+1,right);
    }
}
