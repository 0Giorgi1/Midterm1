package midterm.giorgi_kitiashvili_2.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set to the console
        System.out.println(uniqueWords);

        // Create a map with word length as key and count as value
        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        // Print the map on the console
        System.out.println(wordLengthMap);

        // Define the file path
        String filePath = "C:\\Users\\georg\\IdeaProjects\\midterm\\midterm\\giorgi_kitiashvili_2\\task4\\task4.txt";

        // Check if the file exists, if not, create it
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Append the set and map to the existing file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (String word : uniqueWords) {
                writer.write(word);
                writer.newLine();
            }
            writer.newLine();
            writer.newLine();
            for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}