package com.gupao.springbootdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xuchy
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 7, 2, 4, 9, 2};
        List<Integer> list = Arrays.stream(a).distinct().collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray(new Integer[0])));
    }
}
