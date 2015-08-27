package ex31;

interface Payable<T> {}

class Employee implements Payable {}
class Hourly extends Employee
  implements Payable {} ///:~

