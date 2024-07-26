class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public boolean hasPassed() {
        return grade >= 50;
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345, 78.5);
        student.displayInfo();
        System.out.println("Has passed: " + student.hasPassed());
    }
}

