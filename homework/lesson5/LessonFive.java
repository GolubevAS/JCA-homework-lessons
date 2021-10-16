package ru.homework.lesson5;

public class LessonFive {

        public static class Worker { // create a class "Worker"
            String name;
            String position;
            String email;
            int number;
            int salary;
            int age;

                                     // create the required constructor
            public  Worker (String name, String position,String email, int number, int salary, int age) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.number = number;
                this.salary = salary;
                this.age = age;
            }
            public int getAge() {
                return age;
            }
                                    // create the required method
            public String toString() {
                return (name + "\n-"
                        + position + "\n-"
                        + email + "\n-"
                        + number + "\n-"
                        + salary + "\n-"
                        + age);
            }


        }

        public static void main(String[] args) {
                                          //create the required array
            Worker[] workerArray = new Worker [5];
            workerArray[0] = new Worker("Федор Михайлович Достоевский", "Android Developer", "kjhkjhjkh", 87656555,1000, 59);
            workerArray[1] = new Worker("Александр Сергеевич Пушкин", "Android Developer", "kjhkjhjkh", 87656555,1000, 37);
            workerArray[2] = new Worker("Лев Николаевич Толстой", "Android Developer", "kjhkjhjkh", 87656555,1000, 82);
            workerArray[3] = new Worker("Николай Александрович Бердяев", "Android Developer", "kjhkjhjkh", 87656555,1000, 72);
            workerArray[4] = new Worker("Евгений Иванович Замятин", "Android Developer", "kjhkjhjkh", 87656555,1000, 63);

            for (Worker worker : workerArray)
                if (worker.getAge()>40)
                    System.out.println(worker);

        }
    }







