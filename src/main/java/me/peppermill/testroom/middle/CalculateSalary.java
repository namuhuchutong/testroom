package me.peppermill.testroom.middle;


public class CalculateSalary {

    public static void main(String[] args) {
        CalculateSalary calc = new CalculateSalary();
        calc.getSalaryIncrease(new Employee("hoyeon", 1, 1000));
    }

    public long getSalaryIncrease(Employee employee) {
        long minus;
        switch(employee.getType()) {
            case 1:
                minus = (long) (employee.getSalary() * 0.95);
                return employee.getSalary() - minus;
            case 2:
                minus = (long) (employee.getSalary() * 0.1);
                return employee.getSalary() + minus;
            case 3:
                minus = (long) (employee.getSalary() * 0.2);
                return employee.getSalary() + minus;
            case 4:
                minus = (long) (employee.getSalary() * 0.3);
                return employee.getSalary() + minus;
            case 5:
                return employee.getSalary() * 2;
        }
        return 0;
    }
}
