package ex31;

/*Exercise 31: (1) Remove all the generics from MultipleInterfaceVariants.java and
modify the code so that the example compiles.*/

interface Payable<T> {}

class Employee implements Payable {
	int i = 012;
}
class Hourly extends Employee
  implements Payable {} ///:~

