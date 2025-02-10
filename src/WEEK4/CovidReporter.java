package WEEK4;

public class CovidReporter {
    public static void main(String[] args) {
        CovidProfile profile1 = new CovidProfile();
        profile1.setLocation("Thailand");
        profile1.setAccCases(17023);
        profile1.setCuredCases(11396);
        profile1.setDeathCases(76);

        CovidProfile profile2 = new CovidProfile("2021-01-29", "USA", 25000000, 15000000, 430000);

        profile1.printCovidInfo();
        profile2.printCovidInfo();

        System.out.println("Is " + profile1.getLocation() + " severe? " + profile1.isSevere());
        System.out.println("Is " + profile2.getLocation() + " severe? " + profile2.isSevere());

        // System.out.println("Total CovidProfile objects created: " + CovidProfile.getObjectCount());
    }
}

