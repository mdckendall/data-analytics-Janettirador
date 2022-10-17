class main {
  public static void main(String[] args) {

    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

        int choiceEntry;
    do {
      System.out.println("");
        switch (choiceEntry)
    {
          case 1:
            System.out.println("$98,345 average salary in south Florida!");
            break;
          case 2: 
             System.out.println("US News - 100 Best Jobs!");
            break;
          case 3: 
            System.out.println("Top 10 Forbes In-Demand Jobs!");
            break;
          case 4:
            System.out.println("Top 10 Forbes In-Demand Jobs!");
          default:
            System.out.println("");
      }   
    }   while (choiceEntry != 5);
  }
}
