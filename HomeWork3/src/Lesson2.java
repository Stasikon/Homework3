public class Lesson2 {
    public static class lesson2 {

        public static void main(String[] args){
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();
        }
        public static void task1(){
            int a = 40000;
            short s = 3266;
            long l = 2624645;

            double myDouble = 235.35;
            float c = 3.75F;
            char g = 'a';
            boolean d = true;

            byte b = 22;
            System.out.println(a+" "+b+" "+c+" "+s+" "+l+" "+g+" "+d+" "+myDouble+" Задача 1");
        }


        public static void task2() {
            long myLong = 987678965;
            short myShort = 27897;
            byte myByte = 67;
            short myShort1 = -159;
            int myInt = 569;
            float myFloat = 27.12f;
            int myIntT = 2786;
            System.out.println(myLong+" "+myShort+" "+myByte+" "+myShort1+" "+myIntT+" "+myFloat+" "+myInt+" Задача 1");

        }

        public static void task3() {
            byte ludmila = 23;
            byte anna = 27;
            byte ecaterina = 30;
            int paper = 450;
            int students = ludmila+anna+ecaterina;
            int studentsPaper = paper/students;
            System.out.println( "На каждого ученика рассчитано "+studentsPaper+" листов бумаги."+" Задача 3");
        }
        public static void task4(){
            int bottleProduction = 16;
            int mintsBottle1 = (20/2)*bottleProduction;
            System.out.println(mintsBottle1+" Задача 4");
            int day = 24;
            int datMints = day*60;
            int mintsBottle2 = (datMints/2)*16;
            System.out.println(mintsBottle2+" Задача 4");
            int friDay = datMints*3;
            int mintsBottle3 =(friDay/2)*16;
            System.out.println(mintsBottle3+" Задача 4");
            int month = datMints*30;
            int munthButle = (month/2)*16;
            System.out.println(munthButle+ " Задача 4");
        }

        public static void task5() {
            int paintCans = 120;
            int white = 2;
            int brown = 4;
            int lessonsPaintClass = white+brown;
            int lessons = paintCans / lessonsPaintClass ;
            int lessonsWhite = lessons*white;
            int lessonsBrown = lessons*brown;
            System.out.println("В школе, где "+lessons+" классов, нужно "+lessonsWhite+" банок белой краски и "+lessonsBrown+" банок коричневой краски."+" Задача 5");
        }
        public static void task6(){
            int bananas = 5*80;
            int milk = 105*2;
            int iceCreamSundae = 2*100 ;
            int rawEggs = 4*70;
            int massGrammOll = bananas+milk+iceCreamSundae+rawEggs;
            System.out.println(massGrammOll+" Масса в граммах."+" Задача 6");
            float massKgOll = massGrammOll/1000f;
            System.out.println(massKgOll+" Масса в киллограмах"+" Задача 6");
        }
        public static void task7(){
            int loseWeightKg = 7;
            int loseWeightgr = loseWeightKg*1000;
            int loseWeightDay1 = 250;
            int loseWeightDay2 = 500;
            int day1 = loseWeightgr/loseWeightDay1;
            int day2 = loseWeightgr/loseWeightDay2;
            int onAverageDays = (day1+day2)/2;
            System.out.println(onAverageDays+" может потребоваться дней в среднем"+" Задача 7");
        }
        public static void task8(){
            int miha = 67760;
            int denis = 83690;
            int kristina = 76230;
            int godMiha = miha * 12;
            int godDenis = denis*12;
            int godKristina = kristina*12;
            int plusGodMiha = godMiha;
            int plusGodDenis = godDenis;
            int plusGodKristina = godKristina;
            plusGodMiha += godMiha*0.1;
            plusGodDenis += godDenis*0.1;
            plusGodKristina += godKristina *0.1;
            int differenceMiha =plusGodMiha-godMiha;
            int differenceDenis = plusGodDenis-godDenis;
            int differenceKristina = plusGodKristina-godKristina;
            System.out.println("Годовая запрлата Миши получает "+plusGodMiha+" доход вырос на "+differenceMiha+" рублей"+" Задача 8");
            System.out.println("Годовая запрлата Миши получает "+plusGodDenis+" доход вырос на "+differenceDenis+" рублей"+" Задача 8");
            System.out.println("Годовая запрлата Миши получает "+plusGodKristina+" доход вырос на "+differenceKristina+" рублей"+" Задача 8");

        }
    }

}
