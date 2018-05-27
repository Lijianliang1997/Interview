package oop;

public class Accounting {
  BankEndPoint bank;

  void payAll() {
    Employee.loadAllEmployees();
    for (Employee employee : Employee.allEmployees) {
      employee.getPaid(bank);
    }
  }
}
