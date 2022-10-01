import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");
        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameForReport);

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

        System.out.println("Дополнительное задание 5 (4)");
        fullName = "Ivanov Ivan Ivanovich";
        lastName = fullName.substring(0,fullName.indexOf(" "));
        firstName = fullName.substring(fullName.indexOf(" ") + 1,fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1,fullName.length());
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Отчество сотрудника - " + middleName);

        System.out.println("Дополнительное задание 6 (5)");
        fullName = "ivanov ivan ivanovich";
        String[] fullNameSplit = fullName.split(" ");
        char[][] fullNameSplitAndChar = {fullNameSplit[0].toCharArray(), fullNameSplit[1].toCharArray(), fullNameSplit[2].toCharArray()};
        fullNameSplitAndChar[0][0] = Character.toUpperCase(fullNameSplitAndChar[0][0]);
        fullNameSplitAndChar[1][0] = Character.toUpperCase(fullNameSplitAndChar[1][0]);
        fullNameSplitAndChar[2][0] = Character.toUpperCase(fullNameSplitAndChar[2][0]);
        fullNameSplit[0] = new String(fullNameSplitAndChar[0]);
        fullNameSplit[1] = new String(fullNameSplitAndChar[1]);
        fullNameSplit[2] = new String(fullNameSplitAndChar[2]);
        fullName = fullNameSplit[0] + " " + fullNameSplit[1] + " " + fullNameSplit[2];
        System.out.println("Верное написание ФИО сотрудника с заглавных букв - " + fullName);

        System.out.println("Дополнительное задание 7 (6)");
        String stringA = "135";
        String stringB = "246";
        char[] stringAChar = stringA.toCharArray();
        char[] stringBChar = stringB.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringA.length(); i++) {
            result.append(stringAChar[i]);
            result.append(stringBChar[i]);
        }
        System.out.println("Данные строки - " + result);

        System.out.println("Дополнительное задание 8 (7)");
        String alphabet = "aabccddefgghiijjkk";
        StringBuilder doubles = new StringBuilder();
        char[] alphabetChar = alphabet.toCharArray();
        for (int i = 0; i < alphabetChar.length - 1; i++) {
            if (alphabetChar[i] == alphabetChar[i + 1]) {
                doubles.append(alphabetChar[i]);
            }
        }
        System.out.println(doubles);
    }
}