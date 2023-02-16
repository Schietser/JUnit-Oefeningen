public class Calculator {

    public Double sum(Double num1,Double num2) throws NotANumberException{
        if (num1.isNaN() || num2.isNaN()){
            throw new NotANumberException("You can only use numbers");
        } else {
            return num1+num2;
        }
    }

    public Double subtract(Double num1,Double num2){
        return num1-num2;
    }

//    public Integer subtract(Integer num1, Integer num2){
//        return num1-num2;
//    }

    public Double divide(Double num1,Double num2) throws CalculatorException{
        if (num2 == 0){
            throw new CalculatorException("Can't divide by 0");
        } else {

            return num1/num2;
        }
    }

    public Double multiply(Double num1,Double num2){
        return num1*num2;
    }



}
