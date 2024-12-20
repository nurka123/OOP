public class Main {
    public static void main(String[] args) {

            User user1 = new User("Alex", 25, 70.5, 1.75);
            WorkoutRoutine routine1 = new WorkoutRoutine("Running", 30, 300);
            FitnessApp app1 = new FitnessApp("FitPro", "1.0", 2024);

            System.out.println(user1);
            System.out.println(routine1);
            System.out.println(app1);

            User user2 = new User("Emily", 22, 60.0, 1.68);
            System.out.println("Are users the same? " + user1.getName().equals(user2.getName()));
        }
    }
