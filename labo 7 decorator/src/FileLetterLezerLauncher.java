public class FileLetterLezerLauncher {

    public static void main(String[] args) {

        FileLetterLezer fl = new FileLetterLezer("letters.txt");

        char letter = fl.leesLetter();

        while (letter != '*') {

            System.out.print(letter);

            letter = fl.leesLetter();

        }

    }
}