package JavaLevelOne.Lesson5;

public class Homework5 {
        public static void main(String[] args) {

                Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов

                persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
                        30000, 40);

                persArray[1] = new Employee("Helen G. Strickland", "Meat packer",
                        "HelenGStrickland@teleworm.us",
                        "954-296-9397", 24000, 58);

                persArray[2] = new Employee("Wilson Benjamin", "administrative assistantr",
                        "lkelly@yahoo.co.uk",
                        "02146008371", 8000, 30);

                persArray[3] = new Employee("Griffiths Aaron", "cashier",
                        "jason.edwards@hunt.com",
                        "06984 74611", 18000, 45);

                persArray[4] = new Employee("Price Florence", "graphic artist",
                        "patrick.james@rogers.co.uk",
                        "(04374) 970900", 26000, 38);

                //Employee.employeeCard(employee1);
                for (Employee employee : persArray) {
                        if (employee.getAge() > 40) {
                                Employee.employeeCard(employee);
                                System.out.println("==============");
                        }
                }

        }
}