/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.making.anagrams;

import java.util.Arrays;

/**
 *
 * @author kbos
 */
public class Solution {

    // Complete the makeAnagram function below.
    public static int makeAnagram(String a, String b) {
        StringBuilder anagram = new StringBuilder();
        for (char c : b.toCharArray()) {
            if (a.contains(String.valueOf(c))) {
                a = a.replaceFirst(String.valueOf(c), "");
                b = b.replaceFirst(String.valueOf(c), "");
            }
        }
        return b.length() + a.length();
    }

}
