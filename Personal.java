package lesson5;

public class Personal {
        String fcs;
        String post;
        String email;
        String phone;
        int salary;
        int age;

        public Personal(String fcs, String post, String email, String phone, int salary, int age) {
            this.fcs = fcs;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }


        public void printInfo() {
            System.out.println(String.format("Сотрудник %s на позиции %s, рабочая почта %s и телефон %s, зарплата %s рублей, возраст %s лет", fcs, post, email, phone, salary, age));
        }
    }


