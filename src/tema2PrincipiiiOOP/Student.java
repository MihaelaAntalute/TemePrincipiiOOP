package tema2PrincipiiiOOP;

public class Student extends Person {
    private String groupClass;

    public Student(String firstName, String lastName, String groupClass) {
        super(firstName, lastName);
        this.groupClass = groupClass;
    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }


    public void introduce() {
        System.out.println(" I am " + this.getFirstName() + this.getLastName() + "," + " I am in " + this.groupClass + " and I am a student");
    }

}

