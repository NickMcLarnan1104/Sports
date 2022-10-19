/* 
    Niholas McLarnan
    Assignmnet 4
    This project I will use loops and if statements to display a athletes information.
    This real life problem is being able to enter athlete's information until requested to stop.
    10/01/2022
*/
public class Sport {

    String name, sport, grade, school, position, major;
    int age, schoolIdNumber;

    // default constructor
    public Sport() {}
    // constructor
    public Sport(String name, String sport, String grade, String school, String position, String major, int age, int schoolIdNumber) {
        this.name = name;
        this.sport = sport;
        this.grade = grade;
        this.school = school;
        this.position = position;
        this.major = major;
        this.age = age;
        this.schoolIdNumber = schoolIdNumber;
    }

    // setters and getters
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setSport(String sport) { this.sport = sport; }
    public String getSport() { return sport; }

    public void setGrade(String grade) { this.grade = grade; }
    public String getGrade() { return grade; }

    public void setSchool(String school) { this.school = school; }
    public String getSchool() {  return school; }

    public void setPosition(String position) { this.position = position; }
    public String getPosition() { return position; }

    public void setMajor(String major) { this.major = major; }
    public String getMajor() { return major; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setSchoolIdNumber(int schoolIdNumber) { this.schoolIdNumber = schoolIdNumber; }
    public int getSchoolIdNumber() { return schoolIdNumber; }
    // end setters and getters
    

} // end class

// END PROGRAM