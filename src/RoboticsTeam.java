public class RoboticsTeam {


    int number;
    String name;
    String school;
    String City;
    String State;
    double rp;
    double tbp;
    int matches;
    int highest;


    public RoboticsTeam()
    {

    }

    public void setCity(String city) {
        City = city;
    }

    public void setHighest(int highest) {
        this.highest = highest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRp(double rp) {
        this.rp = rp;
    }

    public void setState(String state) {
        State = state;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTbp(double tbp) {
        this.tbp = tbp;
    }

    public double getRp() {
        return rp;
    }

    public double getTbp() {
        return tbp;
    }

    public int getHighest() {
        return highest;
    }

    public int getMatches() {
        return matches;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return City;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public String getState() {
        return State;
    }

}
