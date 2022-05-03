package staticMethods;

import static staticMethods.MethodUtils.USDToEuro;
import static staticMethods.MethodUtils.euroToUSD;
import static staticMethods.MethodUtils.getTriangleArea;
import static staticMethods.MethodUtils.kmToMiles;
import static staticMethods.MethodUtils.printEuroToUSD;
import static staticMethods.MethodUtils.printKmToMiles;
import static staticMethods.MethodUtils.printSomethingSeveralTimes;
import static staticMethods.MethodUtils.printSumOfEvenDigits;
import static staticMethods.MethodUtils.printToEuro;
import static staticMethods.MethodUtils.printToUSD;
import static staticMethods.MethodUtils.printTrianglePerimeter;
import static staticMethods.MethodUtils.printUSDToEuro;
import static staticMethods.MethodUtils.sumOfEvenNumbers;
import static staticMethods.MethodUtils.toEuro;
import static staticMethods.MethodUtils.toUSD;

public class Client {

	public static void main(String[] args) {

		// 1. метод toUSD
		toUSD(50, 2.55);
		double usd = printToUSD(100, 2.51);
		System.out.println("Курс доллара равен " + usd);

		// 2. метод toEuro
		toEuro(20, 3.01);
		double euro = printToEuro(75, 3.06);
		System.out.println("Курс евро равен " + euro);

		// 3.1 метод EuroToUSD
		euroToUSD(14, 1.16);
		double usd2 = printEuroToUSD(57, 1.162);
		System.out.println("Конверсия доллара к евро равна " + usd2);

		//3.2 метод USDToEuro
		USDToEuro(5, 0.86);
		double euro2 = printUSDToEuro(23, 0.87);
		System.out.println("Конверсия доллара к евро равна " + euro2);
		
		// 4.1 метод printKmToMiles
		printKmToMiles (5);
		
		// 4.2 метод kmToMiles
		double mile = kmToMiles(5);
		System.out.println(mile + " mile");
		
		// 4.3 метод printTrianglePerimeter
		printTrianglePerimeter(5,6,7);
		
		// 4.4 метод getTriangleArea
		double area = getTriangleArea(6, 15, 18);
		System.out.println("Пощадь треугольника равна " + area);
		
		// 4.5 метод printSomethingSeveralTimes
		printSomethingSeveralTimes("quantity", 5);
		
		// 5a. Найти сумму четных цифр числа
		printSumOfEvenDigits(-286);
		
		// 5b.	Посчитать четные и нечетные цифры числа
		sumOfEvenNumbers(-65433);
		
		// 5c. "Переворот" числа
		MethodUtils.reverseNumber(68921);
		
		// 5d. Вычисление факториала числа
		MethodUtils.factorialNumber(21); // 21 - дает не верный ответ т.к. не хватает длины long. есть ли вариант решения??
		
		// 5e. Определить количество простых чисел
		int [] arr  = {3, 0, 18, -7, 37, 55, 62, 73, 85, 97};
		MethodUtils.primeNumer(arr);
		
		// 5f. Сумма и произведение цифр числа
		MethodUtils.sumAndMultDigit(456);
		
		// 5g.	Возведение числа в степень
		MethodUtils.degreeNumber(5, 3);
		
		// 5h. Удалить цифру из числа и вернуть его
		MethodUtils.deletAndReturnDigit(98765, 4);
		
		// 5i. Сумма первой и последней цифр числа
		MethodUtils.sumFirstAndLastDigit(135865);
		
		// 5j. Определить, какая цифра числа больше
		MethodUtils.maxDigit(103562);
		
		// 5k. Вывести делители чисел
		MethodUtils.divisorOfNumbers(88);
		
		// 5l. Вывод таблицы ASCII
		MethodUtils.tableASCII(2001); // не до конца понятно задание (что должно вводиться и что должно выводиться?)
		
		// 5m. Найти одинаковые цифры двух чисел
		MethodUtils.comparisoOfNumbers(36, -1306);
	}

}
