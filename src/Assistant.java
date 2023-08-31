public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {

     boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, long collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println(name + " is studying at home." );
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(name + " teach to other people.");
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("CollegeId: " + collegeId);
    }
}
