import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        Queue<Task> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== To-Do List Menu =====");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display Completed Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();
                    Task newTask = new Task(description, dueDate);
                    toDoList.add(newTask);
                    System.out.println("Task added.");
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        Task completedTask = toDoList.poll();
                        completedTask.markAsCompleted();
                        System.out.println("Task marked as completed: " + completedTask.getDescription());
                    } else {
                        System.out.println("No tasks to mark as completed.");
                    }
                    break;
                case 3:
                    displayCompletedTasks(toDoList);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Task class to represent individual tasks
    public static class Task {
        private String description;
        private String dueDate;
        private boolean isCompleted;

        public Task(String description, String dueDate) {
            this.description = description;
            this.dueDate = dueDate;
            this.isCompleted = false; // Initialize as not completed
        }

        public void markAsCompleted() {
            this.isCompleted = true;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public String getDescription() {
            return description;
        }
    }

    // Method to display completed tasks
    public static void displayCompletedTasks(Queue<Task> toDoList) {
        System.out.println("Completed Tasks:");
        for (Task task : toDoList) {
            if (task.isCompleted()) {
                System.out.println("- " + task.getDescription());
            }
        }
    }
}
