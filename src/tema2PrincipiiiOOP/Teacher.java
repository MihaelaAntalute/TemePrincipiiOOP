package tema2PrincipiiiOOP;

public class Teacher extends Person{
    private String departament;
    private String subject;
    public Teacher (String firstName,String lastName,String departament,String subject){
        super(firstName,lastName);
        this.departament = departament;
        this.subject = subject;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("I am "+ getFirstName() +getLastName()+ ", " + "I work to " + this.departament + " and I teach " + this.subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "departament='" + departament + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }


    }
