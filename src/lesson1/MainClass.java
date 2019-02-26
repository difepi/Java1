package lesson1;

public class MainClass {
        public static void main(String[] args) {
                char symbol;
                symbol = 'M';
                String name = "Ссылочкный тип данных";
                int number = 777;
                float temperature = 36.5f;
                boolean condition;
                byte bNumber = -128;
                short shNumber = 32767;
                long longNumber = 922337777777777L;
                double doublenumber = -65.452332323232777777777755555555558888888888888888888;
                System.out.print("Задание 1.   a * (b + (c / d))=");
                System.out.println(arithmetic(23,34,56,67));
                System.out.println (branchingBool(4,4));
                positiveOrNegative(0);
                ifNegativeisTrue(12);
                greeting("Дмитрий");
                leapYear(2019);
                leapYear(2012);
                leapYear(2000);
                leapYear(1900);

        }

        public static int arithmetic (int a,int b,int c,int d){
                int result;
                result = a * (b + (c / d));
                return (result);
        }

        private static boolean branchingBool(int number_1, int number_2){
                if ((number_1+number_2)<=20){
                        if ((number_1+number_2)>=10){
                                return (true);
                        }
                }
                return (false);
        }

        public static void  positiveOrNegative (int x){
                if (x>=0){
                        System.out.println ("В метод переданно положительное число");
                }
                else {
                        System.out.println ("В метод переданно отрицательное число");
                }
        }
        public static boolean ifNegativeisTrue (int number){
                boolean chek;
                chek = (number<0)?true:false;
                return (chek);
        }
        public static void greeting (String name){
                System.out.println("Привет, "+ name);

        }
        public static void leapYear (int year){
                if (year % 4 == 0 ){
                        if (year % 100 != 0){
                                System.out.println ("год "+ year +" является Високостным");
                        }
                        else {
                                if (year % 400 == 0) {
                                        System.out.println ("год "+ year +" является Високостным");

                        }
                                else {
                                        System.out.println ("год "+ year +" НЕ является Високостным");
                                }


                        }

                }
                 else {
                        System.out.println ("год "+ year +" НЕ является Високостным");
                }


        }
}

