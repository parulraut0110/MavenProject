public class Student {
    private int regNo;
    private String name;
    private double sgpa;

    // Constructor
    public Student(int regNo, String name, double sgpa) {
        this.regNo = regNo;
        this.name = name;
        this.sgpa = sgpa;
    }

    // Getters and Setters
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSgpa() {
        return sgpa;
    }

    public void setSgpa(double sgpa) {
        this.sgpa = sgpa;
    }

    @Override
    public String toString() {
        return "Reg_no: " + regNo + ", Name: " + name + ", SGPA: " + sgpa;
    }
}
