import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Course> courses;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.courses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void subscribeIntoCourse(Course course) {
        courses.add(course);
    }

}