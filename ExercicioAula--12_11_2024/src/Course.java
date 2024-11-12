import java.util.ArrayList;

public class Course {
    private final String name;
    private ArrayList<Lesson> lessons;

   public Course(String name) {
       this.name = name;
       this.lessons = new ArrayList<>();
   }

   public void addLesson(Lesson lesson) {
       lessons.add(lesson);
   }

   public String getName() {
       return name;
   }
}