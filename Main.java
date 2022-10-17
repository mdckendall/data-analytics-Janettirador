import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Names{
  public static void main(String[] args) {
    ArrayList<Names> arrayList = new ArrayList<>();
      
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

      Scanner scanchoice = newScanner(System.in);
      int choiceEntry = scanchoice.nextInt();

        while (choiceEntry != 5) {

        if(choiceEntry < 1 || choiceEntry > 5) {
        choiceentry = scanchoice.nextInt(); 
        }
        else if(choiceEntry == 1) {
        System.out.println("$98,345 average salary in south Florida!");
        }
        else if(choiceEntry == 2) {
        System.out.println("US News - 100 Best Jobs!");
        }
        else if(choiceEntry == 3) {
        System.out.println("Top 10 Forbes In-Demand Jobs!");
        }
        else(choiceEntry == 4) {//name file goes heree
            try{
            FileReader fileReader = new FileReader("names.txt");
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
            String [] curline = scanner.nextline().split(",");
            for(String s : curline){
            System.out.println(s);
            }
            catch(FileNotFoundException f)
            {
        }  System.out.println("testinggg");
      }
    }
  }
}