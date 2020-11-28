package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expr) {
        double a = Double.parseDouble(expr[0]);
        String op1 = expr[1];
        double b = Double.parseDouble(expr[2]);
        String op2 = expr[3];
        double c = Double.parseDouble(expr[4]);
        double result = 0;

            switch (op1) {
                    case "+":
                        switch(op2) {
                            case"+":
                                result = a + b + c;
                                break;
                            case "-":
                                result = a + b - c;
                                break;
                            case "*":
                                result = a + (b * c);
                                break;
                            case "/":
                                result = a + (b / c);
                                break;
                        }
                break;
                case"-":
                        switch(op2){
                            case "-":
                                result = a - b - c;
                                break;
                            case"+":
                                result = a - b + c;
                                break;
                            case "*":
                                result = a - (b * c);
                                break;
                            case "/":
                                result = a - (b / c);
                                break;
                        }
                        break;
                case"*":
                        switch(op2){
                            case "*":
                                result = a * b * c;
                                break;
                            case "/":
                                result = a * b / c;
                                break;
                            case "-":
                                result = a * b - c;
                                break;
                            case"+":
                                result = a * b + c;
                                break;
                    }
                    break;
                case"/":
                        switch(op2){
                            case "/":
                                result = a / b / c;
                                break;
                            case "*":
                                result = a / b * c;
                                break;
                            case "-":
                                result = a / b - c;
                                break;
                            case"+":
                                result = a / b + c;
                                break;
                    }
                    break;
                default:
                    return "error";
            }
            return String.valueOf(result);
        }
}

