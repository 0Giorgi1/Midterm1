package midterm.giorgi_kitiashvili_2.task3;

public class FarmTester {
    public static void main(String[] args) {
        // Creating a CowFarm
        CowFarm farm = new CowFarm();

        // Creating some cows
        Cow cow1 = new Cow();
        cow1.setName("Bessie");
        cow1.setBreed("Holstein");

        Cow cow2 = new Cow();
        cow2.setName("MooMoo");
        cow2.setBreed("Jersey");

        // Adding cows to the farm
        farm.addCow(cow1);
        farm.addCow(cow2);

        // Removing a cow from the farm
        farm.removeCow(cow1);

        // Printing information about cows in the farm
        farm.printStorage();
    }
}