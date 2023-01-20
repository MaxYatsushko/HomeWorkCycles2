public class Main {
    public static void main(String[] args) {
        task1();

        task2();
        System.out.println("");

        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){

        System.out.println("Демонстрация задачи 1");
        int salary = 15_000;
        int total = 0;
        int countMonth = 0;

        while (total < 2_459_000) {
            total = total + total/100;
            total = total + salary;
            countMonth++;

        }
        System.out.println("За " + countMonth + " месяцев, мы накопим " + total);
    }

    public static void task2(){

        System.out.println("Демонстрация задачи 2");
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i);
            if (i != 10){
                System.out.print(" ");
            }
        }


        System.out.println();
        while (i > 0){
            System.out.print(i);
            if (i != 1){
                System.out.print(" ");
            }
            i--;
        }
    }

    public static void task3(){

        System.out.println("Демонстрация задачи 3");
        int curentCitizens = 12_000_000;
        double birthRate = 17.0 / 1000.0, deathRate = 8.0 / 1000.0;
        int currentYear = 2023, finalYear = currentYear + 10;

        while (currentYear < finalYear){

            currentYear++;

            curentCitizens = curentCitizens + (int)(curentCitizens*birthRate) - (int)(curentCitizens*deathRate);
            System.out.println("Год " + currentYear + " численность составляет " + curentCitizens);
        }
    }

    public static void task4(){

        System.out.println("Демонстрация задачи 4");
        double saveAccount = 15_000.0, finalMoney = 12_000_000.0;
        int countMonth = 0 ;

        while (saveAccount < finalMoney) {

            saveAccount +=  saveAccount * 0.07;

            countMonth++;
            //на выводе отбросим копейки
            System.out.println("За месяц " + countMonth + " на счете " + (int) saveAccount + " рублей");

        }
        //на выводе отбросим копейки
        System.out.println("За " + countMonth + " месяцев, мы накопим " + (int) saveAccount);
    }

    public static void task5(){

        System.out.println("Демонстрация задачи 5");
        double saveAccount = 15_000.0, finalMoney = 12_000_000.0;
        int countMonth = 0 ;

        while (saveAccount < finalMoney) {

            saveAccount +=  saveAccount * 0.07;

            countMonth++;
            if (countMonth % 6 == 0) {
                //на выводе отбросим копейки
                System.out.println("За месяц " + countMonth + " на счете " + (int) saveAccount + " рублей");
            }
        }
        //на выводе отбросим копейки
        System.out.println("За " + countMonth + " месяцев, мы накопим " + (int) saveAccount);
    }

    public static void task6(){

        System.out.println("Демонстрация задачи 6");
        double saveAccount = 15_000.0;
        int countMonth = 0 , finalMonth = 9*12;

        while (countMonth < finalMonth) {

            saveAccount +=  saveAccount * 0.07;

            countMonth++;
            if (countMonth % 6 == 0) {
                //на выводе отбросим копейки
                System.out.println("За месяц " + countMonth + " на счете " + (int) saveAccount + " рублей");
            }
        }
        //на выводе отбросим копейки
        System.out.println("За " + countMonth + " месяцев, мы накопим " + (int) saveAccount);
    }

    public static void task7(){

        System.out.println("Демонстрация задачи 7");
        int numberFriday = 5;


    }
}