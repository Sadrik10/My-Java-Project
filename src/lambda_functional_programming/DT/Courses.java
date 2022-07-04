package lambda_functional_programming.DT;

public class Courses {

    // POJO => Plain Old Java Object
    // variables
    // getters and setters
    // constructors
    // toString()

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudent;

    // 1) Constructor with no parameter
    public Courses(){
    }
    // 2) Constructor with parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudent) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudent = numberOfStudent;
    }
    // 3) getters and setters
    public String getSeason() {
        return Season;
    }
    public void setSeason(String season) {
        Season = season;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    // 4) toString()
    @Override
    public String toString() {
        return "Courses{" +
                "Season='" + Season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
