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
        //String op2 = expr[3];
        //double c = Double.parseDouble(expr[4]);
        //String op3 = expr[5];
        //double d = Double.parseDouble(expr[6]);
        //String op4 = expr[7];
        //double e = Double.parseDouble(expr[8]);
        double result = 0;

        if (expr.length >= 3) {
            op1 = op1 + expr[1];

            switch (op1) {
                case "+":
                    result = Integer.parseInt(expr[0] + Integer.parseInt(expr[2]));
                    break;
                    /*case "-":
                        result = a + b - c;
                        break;
                    case "*":
                        result = a + (b * c);
                        break;
                    case "/":
                        result = a + (b / c);
                        break;*/
                default:
                    return "error";
            }

        } else if (expr.length <= 5) {
            op1 = op1 + expr[3];
        }
        /*switch (op1) {
            case "+":
                result = Integer.parseInt(expr[0] + Integer.parseInt(expr[2]));
                break;
                    /*case "-":
                        result = a + b - c;
                        break;
                    case "*":
                        result = a + (b * c);
                        break;
                    case "/":
                        result = a + (b / c);
                        break;
                    default:
                        return "error";
                }*/

        /*else if (expr.length <= 5){
            switch (op3) {
                case "+":
                    switch (op4) {
                        case "+":
                            result = a + b + c + d + e;
                            break;
                        case "-":
                            result = a + b - c + d - e ;
                            break;
                        case "*":
                            result = a + (b * c) + (d * e) ;
                            break;
                        case "/":
                            result = a + (b / c) + (d / e);
                            break;
                    }
                    break;
                case "-":
                    switch (op4) {
                        case "-":
                            result = a - b - c - d - e;
                            break;
                        case "+":
                            result = a - b + c - d + e;
                            break;
                        case "*":
                            result = a - (b * c) - (d * e);
                            break;
                        case "/":
                            result = a - (b / c) - (d / e);
                            break;
                    }
                    break;
                case "*":
                    switch (op4) {
                        case "*":
                            result = a * b * c * d * e;
                            break;
                        case "/":
                            result = a * b / c * d / e;
                            break;
                        case "-":
                            result = a * b - c * (d - e);
                            break;
                        case "+":
                            result = a * b + c * d + e;
                            break;
                    }
                    break;
                case "/":
                    switch (op4) {
                        case "/":
                            result = a / b / c / d / e;
                            break;
                        case "*":
                            result = a / b * c / d * e;
                            break;
                        case "-":
                            result = a / b - c / d - e;
                            break;
                        case "+":
                            result = a / b + c / d + e;
                            break;
                    }
                    break;
                default:
                    return "error";
            }
        }*/
            return String.valueOf(result);

        }

    }