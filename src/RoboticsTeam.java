public class RoboticsTeam {


    public int number;
    public String name;
    public String school;
    public String City;
    public String State;
    public double rp;
    public double tbp;
    public int matches;
    public int highest;


    public RoboticsTeam()
    {

    }
    public String getStat(int num)
    {
        if (num==0) return Integer.toString(getNumber());
        if (num==1) return  getName();
        else if (num == 2) return getSchool();
        else if (num == 3) return getCity();
        else if (num == 4) return getState();
        else if (num == 5) return Double.toString(getRp());
        else if (num == 6) return Double.toString(getTbp());
        else if (num == 7) return Integer.toString(getMatches());
        else if (num == 8) return Integer.toString(getHighest());
        return "";
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
