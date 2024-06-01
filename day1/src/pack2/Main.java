package pack2;

public class Main {
    public static void main(String[] args) {
        Income [] incomes = new Income[] {
                new SalaryIncome(7500),
                new RoyaltyIncome(12000)
        };
        System.out.println(totalTex(incomes));
    }

    public static double totalTex(Income[] incomes) {
        double total = 0;
        for(Income income : incomes) {
            total += income.getTex();
        }
        return total;
    }
}


interface Income {
    double getTex();
}

class SalaryIncome implements Income {
    private double salary;

    public SalaryIncome(double salary) {
        this.salary = salary;
    }
    @Override
    public double getTex() {
        if(salary <= 5000) {
            return 0;
        }
        else if(salary > 5000 && salary <= 10000) {
            return (salary - 5000) * 0.1;
        }
        else {
            return (salary - 10000) * 0.2 + 5000 * 0.1;
        }
    }
}

class RoyaltyIncome implements Income {
    private double salary;

    public RoyaltyIncome(double salary) {
        this.salary = salary;
    }

    @Override
    public double getTex() {
        return salary * 0.2;
    }
}