import java.util.Scanner;

public class Riddle {

    public static int getRandomNumber(int n) {
        int x = (int) (Math.random() * n);
        return x;
    }

    // игра в число
    public static void main(String[] args) {
        int number2 = 1;
        do {
            int x = getRandomNumber(10);
            for (int i = 0; i < 3; i++) {
                System.out.print("Угадайте целое число от 0 до 9: ");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                if (i == 2) {
                    System.out.println("Попытки исчерпаны");
                    break;
                } else if (number == x) {
                    System.out.println("Вы угадали!!");
                    break;
                } else if (number > x) System.out.println("Вы ввели слишком большое число");
                else if (number < x) System.out.println("Вы ввели число меньше загаданного");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scan2 = new Scanner(System.in);
            number2 = scan2.nextInt();
        }
        while (number2 != 0);

    // игра в слова
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"
        };
        String word = words[getRandomNumber(words.length - 1)];
        String userWord;
        System.out.print("Программа загадала слово на английсом языке. Попробуйте отгадать. " +
                "Если слово будет не угадано, но будет совпадение по буквам на правильных местах, они появтся: ");
        do {
            Scanner sc = new Scanner(System.in);
            userWord = sc.nextLine();
            int lengthUserWord = (userWord.length() - 1);
            if (word.equalsIgnoreCase(userWord)) {
                System.out.println("Вы угадали!!");
                break;
            }
            else {
                System.out.println("Вы не угадали. Попробуйте еще раз: ");
                for (int i = 0; i < 15; i++) {
                    if (i>lengthUserWord) break;
                    else if (userWord.charAt(i) == word.charAt(i)) System.out.print(word.charAt(i));
                    else System.out.print("*");
                }
                for (int j=1; j<15-lengthUserWord;j++) System.out.print("*");
            }
        }
        while (word != userWord.toLowerCase());
    }
}


