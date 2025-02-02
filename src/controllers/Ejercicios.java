package controllers;

import java.util.HashMap;

public class Ejercicios {
    public static boolean areAnagrams(String str1, String str2) {
        // Si las longitudes son diferentes, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Crear un HashMap para contar la frecuencia de caracteres
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Contar caracteres de la primera cadena
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Restar caracteres de la segunda cadena
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        return charCount.isEmpty();
    }

    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (map.containsKey(complemento)) {
                return new int[]{map.get(complemento), i};
            }
            map.put(nums[i], i);
        }
        
        return null;
    }
}
