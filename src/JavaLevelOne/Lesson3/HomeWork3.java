package JavaLevelOne.Lesson3;

import java.util.Random;



public class HomeWork3 {

    public static Random random = new Random();


    public static void main(String[] args){
//        // 1.
//        System.out.println("\n\nЗадание 1:\n");
//        int[] array1 = new int [15];
//        recordDataInArray(array1, 0, 1);
//        printArray(array1);
//        InvertArray(array1);
//        System.out.println("\nInvert array:\n");
//        printArray(array1);
//
//        // 2.
//        System.out.println("\n\nЗадание 2:\n");
//        int[] array2 = new int[100];
//        HundredArray(array2);
//        printArray(array2);
//
//         //3.
//        //int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        int[] array3 = new int [12];
//        System.out.println("\n\nЗадание 3:\n");
//        recordDataInArray(array3, 0, 20);
//        System.out.println("\n\n Array3 :\n");
//        printArray(array3);
//        changeArrayInFactor(array3, 6);
//        System.out.println("\n\nChange array3 :\n");
//        printArray(array3);
//
//         //4.
//        System.out.println("\n\nЗадание 4:\n");
//        int[][] array4 = new int [5][5];
//        squareArray(array4, 1);
////        int[][] array4 = {{1,1,1},{1,1,1},{1,1,1}};
//        printArray(array4);
//
//        // 5.
//        System.out.println("\n\nЗадание 5:\n");
//        int[] array5 = createArray(25, 3);
//        printArray(array5);
//
//        // 6.
//        System.out.println("\n\nЗадание 6:\n");
//        int[] array6 = new int [15];
//        recordDataInArray(array6);
//        printArray(array6);
//        minMaxArray(array6);

        // 7.
        int[] array7 = {1,1,10};
        checkBalance(array7);

    }

    // стырено с онлайна
    public static int randomValue(int value1, int value2) {
        if (value2 > value1) {
            int tmp = value2 - value1;
            return value1 + random.nextInt(tmp + 1);
        } else {
            System.out.println("Sorry");
            return -1;
        }
    }

    // стырено с онлайна
    public static void recordDataInArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = randomValue(-20, 20);
        }
    }

    public static void recordDataInArray(int[] inputArray, int a, int b) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = randomValue(a, b);
        }
    }

    // стырено с онлайна
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
    }

    public static void printArray(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                System.out.print(inputArray[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void InvertArray(int[] arrayForInvert){
        for(int i=0; i < arrayForInvert.length; i++){
            if(arrayForInvert[i] ==0){
                arrayForInvert[i] = 1;
            }else{
                arrayForInvert[i] = 0;
            }
        }
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void HundredArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArrayInFactor(int[] array, int factor){
        for(int i = 0; i < array.length; i++){
            if(array[i] < factor){
                array[i] = array[i] * 2;
            }
        }
    }


    //        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//        если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void squareArray(int[][] array, int content){
        for(int i = 0; i < array.length; i++){
            array[i][i] = content;
        }

        int j = 0;
        for(int k = (array.length -1); k > -1; k --){
            array[j][k] = content;
            j++;
        }
    }


    //        5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//        и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] createArray(int len, int initialValue){
        int[] arrayTmp = new int [len];
        for(int i = 0; i < len; i++){
            arrayTmp[i] = initialValue;
        }
        return arrayTmp;
    }


//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minMaxArray(int[] arrayForSearch){
        int min = arrayForSearch[0];
        int max = arrayForSearch[0];
        for(int i = 1; i < arrayForSearch.length; i++){
            if(min > arrayForSearch[i]){
                min = arrayForSearch[i];
            }else if(max < arrayForSearch[i]){
                max = arrayForSearch[i];
            }

        }
        System.out.println("\nМинимальное значениее: " + min);
        System.out.println("\nМаксимальное значениее: " + max);
    }

    //        7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        **Примеры:
//        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//        checkBalance([1, 1, 1, 1, 1, 1, 4 ||| 10]) → true, т.е. 1 + 1 + 1 + 1 + 1 + 1 + 4 = 10
//        checkBalance([1, 1, 10]) → false
//        граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    public static void checkBalance(int[] arrayForCheck){
      int sumLeft = 0;
      int sumRight = 0;
      do {
          for (int i = 0; i < arrayForCheck.length; i++){
              sumLeft += arrayForCheck[i];
              if(i + 1 < arrayForCheck.length){
                  for(int j = i + 1; j < arrayForCheck.length; j ++) {
                      sumRight += arrayForCheck[j];
                  }
                  System.out.println(sumLeft == sumRight);
              }else{
                  System.out.println(sumLeft == sumRight);
                  break;
              }

          }
      }while(true);
    }
}



