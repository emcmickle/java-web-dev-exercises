package org.launchcode.java.studio.countingcharacters;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;

public class CharacterCounter {
    public static void main(String [] args) throws FileNotFoundException {
        String text = "";

        System.out.println(new File(".").getAbsolutePath());
        File myObj = new File("textSample.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            text += myReader.nextLine();
        }
        myReader.close();
        HashMap<Character, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            Integer count = 0;
            Character character = text.charAt(i);
            if (characterCountMap.containsKey(character)) {
                count = characterCountMap.get(character);
            }
            count++;
            characterCountMap.put(character, count);
        }
        for (char i : characterCountMap.keySet()) {
            System.out.println(i + " : " + characterCountMap.get(i));
        }
    }
}
