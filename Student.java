public class Student{
        private String name;
        private String id;
        private String section;
        private String course;
    
        public Student(String name, String id, String section, String course) {
            this.name = name;
            this.id = id;
            this.section = section;
            this.course = course;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getSection() {
            return section;
        }
    
        public void setSection(String section) {
            this.section = section;
        }
    
        public String getCourse() {
            return course;
        }
    
        public void setCourse(String course) {
            this.course = course;
        }
    
        public void showDetails() {
            System.out.println("Student Details:");
            System.out.println("Name    : " + name);
            System.out.println("ID      : " + id);
            System.out.println("Section : " + section);
            System.out.println("Course  : " + course);
        }
    }
    