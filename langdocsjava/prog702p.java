import java.io.*;
import java.util.*;

interface Names {
    String getName();
    String getWord();
}

abstract class Animal implements Names {
    protected String firstName;
    protected String lastName;
    protected String name;

    public Animal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getWord();
}

class Hicca extends Animal {
    private double furValue;

    public Hicca(String firstName, String lastName, double furValue) {
        super(firstName, lastName);
        this.furValue = furValue;
    }

    public double getFurValue() {
        return furValue;
    }

    @Override
    public String getWord() {
        return String.format("$%.2f", furValue);
    }
}

class Wallie extends Animal {
    private double steps;

    public Wallie(String firstName, String lastName, double steps) {
        super(firstName, lastName);
        this.steps = steps;
    }

    public double getSteps() {
        return steps;
    }

    @Override
    public String getWord() {
        return String.valueOf(steps);
    }
}

class Beeper extends Animal {
    private String extraWord;

    public Beeper(String firstName, String lastName, String extraWord) {
        super(firstName, lastName);
        this.extraWord = extraWord;
    }

    @Override
    public String getWord() {
        return extraWord;
    }
}

public class prog702p {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        double totalFurValue = 0;
        double totalSteps = 0;
        double totalWordLength = 0;
        int numHiccas = 0, numWallies = 0, numBeepers = 0;
        StringBuilder allBeepersWords = new StringBuilder();

        try (Scanner scanner = new Scanner(new File("Langdat/prog701g.dat"))) {
            while (scanner.hasNext()) {
                int category = scanner.nextInt();
                if (category == 99) break;

                String firstName = scanner.next();
                String lastName = scanner.next();

                if (category == 1) { 
                    double furValue = scanner.nextDouble();
                    Hicca hicca = new Hicca(firstName, lastName, furValue);
                    animals.add(hicca);
                    totalFurValue += furValue;
                    numHiccas++;
                } else if (category == 2) { 
                    double steps = scanner.nextDouble();
                    Wallie wallie = new Wallie(firstName, lastName, steps);
                    animals.add(wallie);
                    totalSteps += steps;
                    numWallies++;
                } else if (category == 3) { 
                    String extraWord = scanner.next();
                    Beeper beeper = new Beeper(firstName, lastName, extraWord);
                    animals.add(beeper);
                    totalWordLength += extraWord.length();
                    allBeepersWords.append(extraWord);
                    numBeepers++;
                }
            }

            double averageFurValue = numHiccas > 0 ? totalFurValue / numHiccas : 0;
            double averageSteps = numWallies > 0 ? totalSteps / numWallies : 0;
            double averageWordLength = numBeepers > 0 ? totalWordLength / numBeepers : 0;

            Map<Character, Integer> letterFrequency = new HashMap<>();
            for (int i = 0; i < allBeepersWords.length(); i++) {
                char c = allBeepersWords.charAt(i);
                if (Character.isLetter(c)) {
                    letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
                }
            }

            int maxFrequency = 0;
            for (int freq : letterFrequency.values()) {
                maxFrequency = Math.max(maxFrequency, freq);
            }

            List<Character> mostCommonLetters = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
                if (entry.getValue() == maxFrequency) {
                    mostCommonLetters.add(entry.getKey());
                }
            }

            System.out.printf("The average value of the Hicca fur is: %.2f\n", averageFurValue);
            System.out.printf("The average number of steps taken by the Wallies is: %.1f\n", averageSteps);
            System.out.printf("The average size of the Beepers words is: %.2f\n", averageWordLength);

            System.out.println("\nEXTRA CREDIT:");
            System.out.print("The most common letter(s) in all the Beepers' words is: ");
            for (char letter : mostCommonLetters) {
                System.out.print(letter + " ");
            }
            System.out.println();

            System.out.printf("\nThe fur sum is: %.2f\n", totalFurValue);
            System.out.printf("Num Hiccas: %d\n", numHiccas);
            System.out.printf("\nThe number of steps is: %.0f\n", totalSteps);
            System.out.printf("Num Wallies: %d\n", numWallies);
            System.out.printf("\nThe length of the extra Words is: %.0f\n", totalWordLength);
            System.out.printf("Num Beepers: %d\n", numBeepers);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Data file not found.");
        }
    }
}
