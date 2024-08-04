public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
/*
    У вас есть две переменных, в которых хранятся два целочисленных числа.
    Напишите программу, которая выводит в консоль результат деления первого числа на второе с остатком.
    В качестве исходных данных используйте значения для первого числа – 47, для второго – 13)
    В результате деления 47 /13
    Выходит 3 и 8 в остатке
*/
        float num1 = 47;
        float num2 = 13;
        float num3 = num1 / num2;
        System.out.println(num3);
    }

    public static void task2() {
/*
    Напишите программу, которая вычисляет сумму цифр двухзначного числа.
    Программа должна работать с любым значением числа.
    В качестве исходных данных используйте число 44
*/
        int a = 44;
        int b = a % 10;
        int c = (a / 10) % 10;
        System.out.println("Сумма цифр числа " + a + " равна " + (b + c));
    }

    public static void task3() {
/*
    Напишите программу, которая вычисляет сумму цифр трехзначного числа.
    Программа должна работать с любым значением числа. В качестве исходных данных используйте число 345.
*/
        int a = 345;
        System.out.println("Сумма цифр числа " + a + " равна " + ((a % 10) + ((a / 10) % 10) + ((a / 100) % 10)));
    }

    public static void task4() {
/*
    Коля пришел в цветочный магазин и решил купить букет цветов своей подруге. Букет стоит ромашек 4899 рублей.
    К цветам он купил открытку, которая стоит 157 рублей.
    При покупке Коле дали скидку в 10% на сумму двух покупок.
    Вычислите и выведите в консоль сумму двух покупок с учетом скидки.
    Отдельно выведите сумму скидки двух покупок.
 */
        int flowers = 4899;
        int postcard = 157;
        float tax = 10;
        float discount = (tax / 100);
        float amountPurchasesTax = (flowers + postcard) - (flowers + postcard) * discount;
        System.out.println("Сумма двух покупок с учетом скидки = " + amountPurchasesTax + " рублей");
        System.out.println("Сумм скидки двух покупок = " + (flowers + postcard) * discount + " рублей");
    }

    public static void task5() {
/*
    Сделайте расчет товаров со скидками.
    а) Апельсины стоят 73 руб/кг и на них действует скидка 15%, а товар бананы стоят 95 руб/кг.
    Клиент взял 10 кг апельсинов и 2кг бананов.
    Вычислите и выведите в консоль сумму  покупки с учетом скидки.
 */
        int oranges = 73;
        int orangesKg = 10;
        int bananas = 95;
        int bananasKg = 2;
        float tax = 15;
        float discount = (tax / 100);
        float totalOranCash = (oranges * orangesKg) - (oranges * orangesKg) * discount;
        int totalBananaCash = bananas * bananasKg;
        System.out.println("Сумму  покупки с учетом скидки = " + (totalBananaCash + totalOranCash) + " рублей");

/*
    б) Шампанское стоит 2870 руб и на него действует скидка 50%, а товар хлеб стоит 27 руб.
    Клиент взял 7 бутылок шампанского и 1 батон хлеба.
    Вычислите и выведите в консоль сумму покупки с учетом скидки.
 */
        int champagne = 2870;
        int bread = 27;
        int quantityChampagne = 7;
        float percent = 50;
        float discount1 = (percent / 100);
        float totalCash = champagne * quantityChampagne - (champagne * quantityChampagne) * discount1 + bread;
        System.out.println("Сумму  покупки с учетом скидки = " + totalCash + " рублей");

/*
    в) Шампиньоны стоят 436 руб/кг, а белые грибы стоят 578 руб/кг и на них действует скидка 5%.
    Клиент взял 2,5 кг шампиньонов и 3,75 кг белых грибов.
    Вычислите и выведите в консоль сумму покупки с учетом скидки.
 */
        int champignons = 436;
        int whiteMushroom = 578;
        float percent1 = 5;
        float quantityChampignons = 2.5f;
        float quantityWhiteMushroom = 3.75f;
        float disc = (percent1 / 100);
        float cashChampignons = champignons * quantityChampignons;
        float cashWhiteMushroom = whiteMushroom * quantityWhiteMushroom - (whiteMushroom * quantityWhiteMushroom) * disc;
        System.out.println("Сумму  покупки с учетом скидки = " + (cashChampignons + cashWhiteMushroom) + " рублей");
    }

    public static void task6() {
/*
    Объявите 2 переменных типа double ****со значениями
    x = 0.40, y = 0.87;
    Посчитайте следующие выражения и выведите результат программы в консоль после каждого подсчета:
    11*x + y
    (x+10*y)- 15*(x/y)
 */
        double x = 0.40;
        double y = 0.87;
        double z = 11 * x + y;
        double w = (x + 10 * y) - 15 * (x / y);
        System.out.println(z);
        System.out.println(w);
    }
}