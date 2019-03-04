package lesson2;

import java.security.PublicKey;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int [] expArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0,1,0,0,1,1,1 };
        int [] nullArray = new int[8];
        int [] operationArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int [][] twoArray  = new int[15] [15];
        System.out.print("(Задание 1.) " + Arrays.toString(expArray)+ "===>");
        changeArray(expArray);                                    // Задание 1.
        System.out.println (Arrays.toString(expArray));
        fillArray(nullArray);                                     //Задание 2.
        System.out.println("(Задание 2.) " + Arrays.toString(nullArray));
        System.out.print("(Задание 3.) ");
        sixtwoArray(operationArray);                              //Задание 3.
        diagonalArray(twoArray);                                  //Задание 4.
        System.out.println("(Задание 4.)");

        for (int i=0;i<twoArray.length;i++){                      //Вывод массива в консоль из Задания 4.
            for (int j=0; j<twoArray.length;j++){
                System.out.print(twoArray[i][j]);
            }
            System.out.println(" ");
        }

        System.out.print("(Задание 5.) Из целочисленного массива " + Arrays.toString(operationArray)); //Задание 5.
        minmaxArray(operationArray);

        System.out.print("(Задание 6. )");
        if (checkBalance(operationArray)==true){                                                        //Задание 6.
            System.out.println("Ленвая и права часть массива равны");
        } else {
            System.out.println("Левая и правая части массива не равны");
        }
    evenArray();//Дополнительное задание 1.
         System.out.println(" ");

    randomARR(); //Дополнительное задание 2.
        arrayTwoRandom();
    }

    public static void changeArray (int [] intAray){                  // Задание 1.
        for (int i=0; i<intAray.length;i++){
            intAray[i]=intAray[i]==1?0:1;
        }
    }

    public static void fillArray (int [] intArray){                  // Задание 2.
        int x,y;
        x=y=0;
        while (x<intArray.length){
            intArray[x]=y;
            x++;
            y+=3;
        }
    }

    public static void sixtwoArray (int [] intArray){                //Задание 3. Судя по формулировке задания. Речи об изменении
        for (int i=0; i<intArray.length; i++){                       //элемента масиива не было. Просто умножить чило попадающее под условие на 2.
            if (intArray[i]<6) {                                     //Надеюсь, задание правильно интерпритированно мной.*/
                System.out.print ((intArray[i]*2) + " " );
            }
        }
        System.out.println("");
    }

    public static void diagonalArray (int [][] intArray){            //Задание 4.
        int right=intArray.length-1;
        for (int i=0;i<intArray.length;i++){
            for (int j=0;j<intArray.length;j++){
                if (i==j) {
                    intArray[i][j]=1;
                }else
                {
                    intArray[i][j]=0;
                }
            }
            intArray[i][right]=1;
            right--;
        }
    }

    public static void minmaxArray (int [] intArray){                   //Задание 5.
        int min,max;
        min=max=intArray[0];
        for (int i=0;i<intArray.length;i++){
            if (intArray[i]<min) {
                min=intArray[i];
            }
            if (intArray[i]>max){
                max=intArray[i];
            }
        }
        System.out.println(" Максимальный элемент = " + max + " Минимальный элемент = " + min);
    }

    public static boolean checkBalance (int [] intArray){              //Задание 6
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < intArray.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += intArray[j];
            }

            for (int j = i; j < intArray.length; j++) {
                rightSum += intArray[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
        }


        public static void evenArray () {                                                               //Дополнительное задание 1
            int[] arr = new int[99];
            int counter = 1;
            System.out.print("(Дополнительное задане 1");
            for (int i = 0; i < arr.length - 1; i++) {
                if ((i % 2) != 0) {
                    arr[counter] = i;
                    counter++;
                }
            }
            for (int i = 0; i < 50; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void randomARR(){                                                                 //Дополнительное задание 2.
        System.out.print("(Дополнительное задание 2.)");
        int [] arr = new int [15];
        for (int  i=0;i<15; i++) {
            arr[i] = (int) (Math.random() * 9);
            System.out.print(arr[i] + " ");
        }
        int sum=0;

        for (int j=0; j<15; j++) {
            if ((arr[j] % 2 == 0)&&(arr[j]!=0)) {
                sum++;
            }
        }
            System.out.println(" Количество четных элементов массива = " + sum);

        }

        public static void arrayTwoRandom (){                        //Дополнительное задание 3.
           int [] arr1 = new int [5];
           int [] arr2 = new int [5];
           float sumarr1=0f;
           float sumarr2=0f;
           System.out.println ("(Дополнительное задание 3.)");
          for (int i=0; i<5; i++){
            arr1[i] = (int) (Math.random()*5);
            arr2[i] = (int) (Math.random()*5);
            sumarr1+=arr1[i];
            sumarr2+=arr2[i];
          }
      System.out.println (Arrays.toString(arr1));
      System.out.println ("Среднее арифметическое первого массива "+((sumarr1/5))) ;
      System.out.println (Arrays.toString(arr2));
      System.out.println ("Среднее арифметическое второго  массива "+((sumarr2/5)));

      if (sumarr1==sumarr2){
          System.out.println ("Средние арифметические равны");
      }else{
          if(sumarr1>sumarr2){
              System.out.println ("Среднее арифметическое первого массива больше второго");
              }
          else {
                System.out.println ("Среднее арифметическое первого массива меньше второго");
          }
      }

    }
}



