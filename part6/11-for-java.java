import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        //int n = sc.nextInt();
        int n = 3;

        // N명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>();
/*
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }
*/
        students.add(new Student("홍길동", 95));
        students.add(new Student("이순신", 77));
        students.add(new Student("신", 88));


        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }
    }


    class Student implements Comparable<Student> {

        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return this.name;
        }

        public int getScore() {
            return this.score;
        }

        // 정렬 기준은 '점수가 낮은 순서'
        @Override
        public int compareTo(Student other) {
            /*if (this.score < other.score) {
                return -1;
            }
            return 1;
            */

            // 결과 값이 양수면 위치를 바꿈
            // 95 - 77 = 18 이므로 '95'와 '77'의 위치를 바꿔서 내림차순 정렬이 됨
            return this.score - other.score;
        }
    }
}