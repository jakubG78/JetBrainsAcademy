import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company[] companies = new Company[scanner.nextInt()];
        for (int i = 0; i < companies.length; i++) {
            companies[i] = new Company();
            companies[i].setIncome(scanner.nextInt());
        }
        int indexOfCompanyHighestTax = 0;
        double highestTaxPaid = 0;
        for (int i = 0; i < companies.length; i++) {
            companies[i].setTaxRate(scanner.nextInt());
            double taxPaidByCompany = companies[i].getIncome() * (companies[i].getTaxRate() / 100.00);
            if (taxPaidByCompany > highestTaxPaid) {
                indexOfCompanyHighestTax = i + 1;
                highestTaxPaid = taxPaidByCompany;
            }
        }
        System.out.println(indexOfCompanyHighestTax);
    }
}

class Company {

    protected int income;
    protected int taxRate;

    public Company() {
        this.income = 0;
        this.taxRate = 0;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public int getTaxRate() {
        return taxRate;
    }

    @Override
    public String toString() {
        return "Company{" +
                "income=" + income +
                ", taxRate=" + taxRate +
                '}';
    }

    public int getIncome() {
        return income;
    }
}