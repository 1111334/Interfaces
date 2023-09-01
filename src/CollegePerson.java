public class CollegePerson {
   protected String name;
   protected String surname;
   protected long collegeId;

    public CollegePerson(String name, String surname, long collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("CollegeId: " + collegeId);
    }




}
