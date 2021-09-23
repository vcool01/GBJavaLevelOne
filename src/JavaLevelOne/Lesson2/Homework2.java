package JavaLevelOne.Lesson2;

public class Homework2 {

    public static void main(String[] args) {
	// write your code here
        rangeSum (18, -3);
        signNumber(1);
        signNumberBool(-1);
        printCopies("Это строка", 3);
        leapYear(2000); // 2020 2021 2000 2100
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
    // пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void rangeSum (int ValueA, int ValueB){

        System.out.println ((ValueA + ValueB) >10  &&  (ValueA + ValueB) < 20);
    }

    //        2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//        положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void signNumber (int c){
       // System.out.println(c >= 0);
        if (c >=0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    //        3. Написать метод, которому в качестве параметра передается целое число.
    //        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static void signNumberBool (int d){
        System.out.println(d < 0);

    }

    //        4. Написать метод, которому в качестве аргументов передается строка и число,
    //        метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printCopies(String example, int factor){
        for(int i =1; i<= factor; i++){
            System.out.println(example);
        }
    }

//        5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//        не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
//        – високосный.

    public static void leapYear(int year){
        // 1.
       // System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0));

//        2.
//        if(year % 4 == 0 && year % 100 != 0){
//                System.out.println("true");
//            }else if(year % 4 == 0 && year % 400 == 0){
//                  System.out.println("true");
//              }else System.out.println("false");


    }
}

