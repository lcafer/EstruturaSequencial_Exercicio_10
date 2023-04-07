package EstruturaSequencial_Exercicio_10;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        System.out.println("Qual o valor da temperatura em Fahrenheit que você deseja converter para celsius?");
        String inputToString = userInput.nextLine();
        inputToString = inputToString.replaceAll("[^[+-]?([0-9]*[.,])?[0-9]+]", "");
		//caso o número for digitado com virgula e não ponto. Troque-os para armazenar na variável double.
		if(inputToString.contains(",")) inputToString = inputToString.replace(",", ".");
        double conversionCelsiusToFahrenheit = ((Double.parseDouble(inputToString)*1.8) + 32); 
        inputToString = String.valueOf(conversionCelsiusToFahrenheit);
        //Dê o output com virgula e não ponto. 
		String dotForComma = inputToString.replace(".", ",");
        System.out.println(dotForComma + "°F");
        userInput.close();
    }
}
