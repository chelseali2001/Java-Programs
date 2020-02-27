import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Person_3 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String[][] test = new String[5][5];
		String[] answer = new String[5];

		System.out.println("Enter your questions");

		for (int x = 1; x <= 5; x++) {
			System.out.print(x + ". ");
			test[x - 1][0] = s.nextLine();

			System.out.println("Enter 4 answer choices:");

			System.out.print("	a. ");
			test[x - 1][1] = s.nextLine();

			System.out.print("	b. ");
			test[x - 1][2] = s.nextLine();

			System.out.print("	c. ");
			test[x - 1][3] = s.nextLine();

			System.out.print("	d. ");
			test[x - 1][4] = s.nextLine();

			System.out.println("Which one is the right answer: a, b, c, or d?");
			answer[x - 1] = s.nextLine();
		}

		try {
            FileWriter fileWriter = new FileWriter("TEST.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int x = 0; x < 5; x++) {
                bufferedWriter.write((x + 1) + ". " + test[x][0] + "\n");
                bufferedWriter.write("	a. " + test[x][1] + "\n");
                bufferedWriter.write("	b. " + test[x][2] + "\n");
                bufferedWriter.write("	c. " + test[x][3] + "\n");
                bufferedWriter.write("	d. " + test[x][4] + "\n");
            }
           
            bufferedWriter.close();
		} catch(FileNotFoundException ex) {
            System.out.println("File not found");
        } catch(IOException ex) {
            System.out.println("Can't read from file");
        }

		try {
            FileWriter fileWriter = new FileWriter("ANSWER.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int x = 0; x < 5; x++) {
                bufferedWriter.write(answer[x] + "\n");
            }
           
            bufferedWriter.close();
		} catch(FileNotFoundException ex) {
            System.out.println("File not found");
        } catch(IOException ex) {
            System.out.println("Can't read from file");
        }
	}
}