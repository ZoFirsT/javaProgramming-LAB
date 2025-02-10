package WEEK4;

public class CovidProfile {
    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;

    public CovidProfile() {
        this.date = "none";
        this.location = "none";
        this.accumulatedCases = 0;
        this.curedCases = 0;
        this.deathCases = 0;
    }

    public CovidProfile(String _date, String loc, int noACC, int noCured, int noDeath) {
        this.date = _date;
        this.location = loc;
        this.accumulatedCases = noACC;
        this.curedCases = noCured;
        this.deathCases = noDeath;
    }

    public String getLocation() {
        return location;
    }

    public int getAccCases() {
        return accumulatedCases;
    }

    public int getCuredCases() {
        return curedCases;
    }

    public int getDeathCases() {
        return deathCases;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public void setAccCases(int value) {
        this.accumulatedCases = value;
    }

    public void setCuredCases(int value) {
        this.curedCases = value;
    }

    public void setDeathCases(int value) {
        this.deathCases = value;
    }

    public void printCovidInfo() {
        System.out.println(location.toUpperCase() + " at " + date);
        System.out.println("Accumulative Patient: " + accumulatedCases);
        System.out.println("Cured Patient: " + curedCases);
        System.out.println("Death Case: " + deathCases);
        System.out.println();
    }

    public boolean isSevere() {
        return deathCases > 10000;
    }
    public int isSevereNum() {
        // System.out.println(deathCases);
        return deathCases;
    }

}
