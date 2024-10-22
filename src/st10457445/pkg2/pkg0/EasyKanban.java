
package st10457445.pkg2.pkg0;

import java.util.Scanner;

public class EasyKanban
{
    
    public void testAddTask() {
        

        // Task 1
        Task task1 = new Task(
            "login feature",
            "create login to authenticate users",
            "Robyn Harrison",
            8,
            "To Do"
        );

       

        // Task 2
        Task task2 = new Task(
            "add task feature",
            "create add task feature to add task users",
            "Mike Smith",
            10,
            "Doing"
        );

            }
   //FUNCTION TO ASK THE USER TO CHOOSE FROM VARIOUS OPTIONS
   static void addTasks(Scanner scanner) 
          {
              int option;
            do {
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Add tasks");
                System.out.println("2. Show report (Coming soon)");
                System.out.println("3. Quit");

                option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option)
                {
                    case 1:
                        addTasks(scanner);
                        break;
                    case 2:
                        System.out.println("Coming soon...");
                        break;
                    case 3:
                        System.out.println("Exiting the application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } while (option != 3);
}
}
