class main {
  public static void main(String[] args) {

    int names = myScannerinput.nextInt();
    Scanner myScanner =null;

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
        else(choiceEntry == 4) {
        myScanner = new Scanner(new File("names.txt"));
      }
    }
  }
}