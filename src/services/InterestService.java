package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    default double payment(double amount, int months){
        if(months < 1){
            throw new InvalidParameterException("Months must be greater than zero ");
        }
        return amount * Math.pow(1 + getInterestRate() / 100.0, months); //Aqui o Math.pow é usado para elevar ao número que queremos a expressão que queremos, no caso depoius da vígula será o valor da quantidade de vezes que vai ser elevado
    }
}
