public class Professor extends CollegePerson implements TeachingPerson {
    protected String teachingSubject;
    public Professor(String name, String surname, long collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name +  " teach to other people.");
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("CollegeId: " + collegeId);
    }


}
