public class Main {

  public static void main(String[] args) {

    int second = 0;
    String functionToRun = args[0];
    int firstNum = Integer.getInteger(args[1]);
    if(!args[2].equals(null)) {
      second = Integer.getInteger(args[2]);
    }

    Calculator calc = new Calculator();

    if (args[0].equals("add")) {
      System.out.println(calc.add(firstNum,second));
    }
    else if(args[0].equals("subtract")) {
      System.out.println(calc.subtract(firstNum,second));
    }
    else if(args[0].equals("multiply")) {
      System.out.println(calc.multiply(firstNum,second));
    }
    else if(args[0].equals("binary")) {
      System.out.println(calc.intToBinaryNumber(firstNum));
    }
    else if(args[0].equals("fibonacci")) {
      System.out.println(calc.fibonacciNumberFinder(firstNum));
    }
    else {
      System.out.println("Please type in valid input");
    }
  }

}
