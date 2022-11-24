public class Student extends Person{
    private String programing;
    private int yaer;
private double fee;

    public Student() {
    }

    public Student(String name, String address, String programing, int yaer, double fee) {
        super(name, address);
        this.programing = programing;
        this.yaer = yaer;
        this.fee = fee;
    }

    public String getPrograming() {
        return programing;
    }

    public void setPrograming(String programing) {
        this.programing = programing;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
