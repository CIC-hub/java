
/**
 * 定义抽象类Income
 */
abstract class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public abstract double getTax();
}
