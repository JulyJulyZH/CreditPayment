public class CreditPaymentService {
    public int calculate(double persent_years, int creditSumm_rub, int period_years) {
        double persent_month = persent_years / 12 / 100; // пересчитываем проценты в год на месяцы
        int period_month = period_years * 12; // выражаем период в месяцах
        double payment = (creditSumm_rub * persent_month * Math.pow((1 + persent_month), period_month)) / (Math.pow((1 + persent_month), period_month) - 1);
        int payment_month = (int) payment;
        return payment_month;
    }

}
