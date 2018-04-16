package com.quickSort;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    @Test
   public void testQuickSort(){
       int[] arr1={23,24,21,5,435,342,54,2,12,345,2};
        System.out.println("未排序前："+ Arrays.toString(arr1));
        SortUtils.qucikSort(arr1,0,arr1.length -1);

        System.out.println("快速排序后"+Arrays.toString(arr1));
   }
}
