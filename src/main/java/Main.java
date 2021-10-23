public class Main {

  public static void main(String[] args) {

    int second = 0;
    String functionToRun = args[0];

    String firstNum = args[1];
    int firstNumber = Integer.valueOf(firstNum);
    if(args.length >= 3) {
      second = Integer.valueOf(args[2]);
    }

    Calculator calc = new Calculator();

    if (args[0].equals("add")) {
      System.out.println(calc.add(firstNumber,second));
    }
    else if(args[0].equals("subtract")) {
      System.out.println(calc.subtract(firstNumber,second));
    }
    else if(args[0].equals("multiply")) {
      System.out.println(calc.multiply(firstNumber,second));
    }
    else if(args[0].equals("binary")) {
      System.out.println(calc.intToBinaryNumber(firstNumber));
    }
    else if(args[0].equals("fibonacci")) {
      System.out.println(calc.fibonacciNumberFinder(firstNumber));
    }
    else if(args[0].equals("divide")) {
      System.out.println(calc.divide(firstNumber,second));
    }
    else {
      System.out.println("Please type in valid input");
    }
  }

}
