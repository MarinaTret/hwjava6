package ru.netology.stats;
public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;

    }
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lessThanAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0; // нужна переменная, чтобы не считать в 100 раз больше
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public int moreThanAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count =0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                count++;
            }
        }
        return count;
    }
}

/* Статистика — очень важная составляющая любого бизнеса. У вас есть набор данных о продажах предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].

Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву ежемесячных продаж:

1. стоимость всех продаж;
2. средний объем продаж в месяц;
3. В номере месяца, в котором были пиковые продажи, есть продажи на основе мощности*;
4. в номере месяца, в котором были минимальные продажи, осуществляются продажи по минимальной сумме*;
5. количество месяцев, в которых продажи были ниже среднего (см. п.2);
6. количество месяцев, в которых продажи были выше среднего (см. п.2).*/