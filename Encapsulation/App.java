public class App {

    public static void main(String[] args) {

        student A = new student(1, 20, "Satyam_Baba", 3);
        System.out.println("NAME - " + A.name);
        System.out.println("ID - " + A.id);
        System.out.println("AGE - " + A.age);
        System.out.println("No. OF SUBJECTS - " + A.nos);

        A.bunk();
        A.study();
        A.sleep();
    }
}