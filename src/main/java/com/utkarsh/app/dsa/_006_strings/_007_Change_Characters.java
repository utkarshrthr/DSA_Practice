package com.utkarshrathore.app.hd.dsa._006_strings;

public class _007_Change_Characters {
    /*
    *  You are given a string A of size N consisting of lowercase alphabets. You can change at most B
    * characters in the given string to any other lowercase alphabet such that the number of distinct
    * characters in the string is minimized. Find the minimum number of distinct characters in the
    * resulting string.
    *
    * A = "abcabbccd", B = 3
    *
    *   create a frequency map for this using array {a->2, b->3, c->3, d->1}
    *   after sorting this array we know that most frequent element is last one
    *   {d->1, a->2, b->3, c->3}
    *   Now we start iterating from first non-zero element in the array, i.e 1(d)
    *   will decrease its value by <=b
    *
    *   Edge case:
    *   1. B=0,
    *   2. if string has only <=2 characters
    *
    *   T.C. => O(B)
    * */
/*
* a
*
* */
    public static void main(String[] args) {

    }
}
