public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int num1 = 1147463647;
        byte num2 = 125;
        short num3 = 32666;
        long num4 = 720368547758L;
        float num5 = 65.36345233f;
        double num6 = 945.52130;
        System.out.println("Значение переменной num1 c типом int равно " + num1);
        System.out.println("Значение переменной num2 c типом byte равно " + num2);
        System.out.println("Значение переменной num3 c типом short равно " + num3);
        System.out.println("Значение переменной num4 c типом long равно " + num4);
        System.out.println("Значение переменной num5 c типом float равно " + num5);
        System.out.println("Значение переменной num6 c типом double равно " + num6);

        //Задача №2
        float number1 = 27.12f;
        long number2 = 987678965549L;
        double number3 = 2.786;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;

        System.out.println("Задача №3");
        int totalStudentsLyudmila = 23;
        int totalStudentsAnna = 27;
        int totalStudentsEkaterina = 30;
        int totalPaper = 480;
        int eachStudentSheets = totalPaper / (totalStudentsLyudmila + totalStudentsAnna + totalStudentsEkaterina);
        System.out.println("На каждого ученика рассчитано " + eachStudentSheets + " листов бумаги");

        System.out.println("Задача №4");
        int machinePerformanceTwoMinutes = 16;
        int machinePerformanceOneMinute = machinePerformanceTwoMinutes / 2;
        int hoursDay = 24;
        int minutesHour = 60;

        String min20 = "20 минут";
        int minutes20 = 20;
        int performance20Minutes = minutes20 * machinePerformanceOneMinute;
        System.out.println("За " + min20 + " машина произвела " + performance20Minutes + " штук бутылок");

        String day1 = " сутки ";
        int performanceDay = hoursDay * minutesHour * machinePerformanceOneMinute;
        System.out.println("За" + day1 + "машина произвела " + performanceDay + " штук бутылок");

        String day3 = " 3 дня ";
        int quantityDays = 3;
        int performanceThreeDays = quantityDays * hoursDay * minutesHour * machinePerformanceOneMinute;
        System.out.println("За" + day3 + "машина произвела " + performanceThreeDays + " штук бутылок");

        String oneMonth = " один месяц ";
        int quantityDaysOneMonth = 31;
        int performanceOneMonth = quantityDaysOneMonth * hoursDay * minutesHour * machinePerformanceOneMinute;
        System.out.println("За" + oneMonth + "машина произвела " + performanceOneMonth + " штук бутылок");

        System.out.println("Задача №5");
        int totalCansPaint = 120;
        int oneClassWhitePaint = 2;
        int oneClassBrownPaint = 4;
        int oneClassCans = oneClassWhitePaint + oneClassBrownPaint;
        int totalClass = totalCansPaint / oneClassCans;
        int totalCansWhitePaint = oneClassWhitePaint * totalClass;
        int totalCansBrownPaint = oneClassBrownPaint * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalCansWhitePaint + " банок белой краски и " + totalCansBrownPaint + " банок коричневой краски");

        System.out.println("Задача №6");
        byte totalBananas = 5; //почему подчеркивается волнистой линией?
        byte oneBananaGr = 80;
        short totalMilkMg = 200;
        byte oneMilkMg = 100;
        byte milk100Gr = 105;
        byte totalIceCream = 2;
        byte iceCreamGr = 100;
        byte totalRawEggs = 4;
        byte oneEggGr = 70;
        int totalBananasGr = totalBananas * oneBananaGr;
        int totalMilkGr = totalMilkMg / oneMilkMg * milk100Gr;
        int totalIceCreamGr = totalIceCream * iceCreamGr;
        int totalRawEggsGr = totalRawEggs * oneEggGr;
        int totalGrams = totalBananasGr + totalMilkGr + totalIceCreamGr + totalRawEggsGr;
        System.out.println(totalGrams + " гр");
        float oneKg = 1000;
        float Kg = totalGrams / oneKg;
        System.out.println(Kg + " кг");

        System.out.println("Задача №7");
        byte needLoseKg = 7;
        short oneKgGr = 1000;
        int needLoseGr = needLoseKg * oneKgGr;
        short needLoseDay250Gr = 250;
        short needLoseDay500Gr = 500;
        int totalDays250Gr = needLoseGr / needLoseDay250Gr;
        int totalDays500Gr = needLoseGr / needLoseDay500Gr;
        int averageDays = (totalDays250Gr + totalDays500Gr) / 2;
        System.out.println("Если спортсмен будет худеть каждый день по 250 грамм, то на похудение уйдет " + totalDays250Gr + " дней ");
        System.out.println("Если спортсмен будет худеть каждый день по 500 грамм, то на похудение уйдет " + totalDays500Gr + " дней ");
        System.out.println("Чтобы добиться результата похудения, в среднем потребуется " + averageDays + " день");

        System.out.println("Задача №8");
        int monthlySalaryMasha = 67760;
        int monthlySalaryDenis = 83690;
        int monthlySalaryKristina = 76230;
        float tax = 10;
        int months = 12;
        int yrSalaryMasha = monthlySalaryMasha * months;
        int yrSalaryDenis = monthlySalaryDenis * months;
        int yrSalaryKristina = monthlySalaryKristina * months;
        float monthlySalaryMashaTax = (tax / 100) * monthlySalaryMasha + monthlySalaryMasha;
        float monthlySalaryDenisTax = (tax / 100) * monthlySalaryDenis + monthlySalaryDenis;
        float monthlySalaryKristinaTax = (tax / 100) * monthlySalaryKristina + monthlySalaryKristina;
        float yrSalaryMashaTax = monthlySalaryMashaTax * months;
        float yrSalaryDenisTax = monthlySalaryDenisTax * months;
        float yrSalaryKristinaTax = monthlySalaryKristinaTax * months;
        float differenceSalaryMasha = yrSalaryMashaTax - yrSalaryMasha;
        float differenceSalaryDenis = yrSalaryDenisTax - yrSalaryDenis;
        float differenceSalaryKristina = yrSalaryKristinaTax - yrSalaryKristina;
        System.out.println("Маша теперь получает " + monthlySalaryMashaTax + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + monthlySalaryDenisTax + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + monthlySalaryKristinaTax + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей");

    }
}