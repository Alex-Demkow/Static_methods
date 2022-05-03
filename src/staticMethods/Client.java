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

		// 1. ����� toUSD
		toUSD(50, 2.55);
		double usd = printToUSD(100, 2.51);
		System.out.println("���� ������� ����� " + usd);

		// 2. ����� toEuro
		toEuro(20, 3.01);
		double euro = printToEuro(75, 3.06);
		System.out.println("���� ���� ����� " + euro);

		// 3.1 ����� EuroToUSD
		euroToUSD(14, 1.16);
		double usd2 = printEuroToUSD(57, 1.162);
		System.out.println("��������� ������� � ���� ����� " + usd2);

		//3.2 ����� USDToEuro
		USDToEuro(5, 0.86);
		double euro2 = printUSDToEuro(23, 0.87);
		System.out.println("��������� ������� � ���� ����� " + euro2);
		
		// 4.1 ����� printKmToMiles
		printKmToMiles (5);
		
		// 4.2 ����� kmToMiles
		double mile = kmToMiles(5);
		System.out.println(mile + " mile");
		
		// 4.3 ����� printTrianglePerimeter
		printTrianglePerimeter(5,6,7);
		
		// 4.4 ����� getTriangleArea
		double area = getTriangleArea(6, 15, 18);
		System.out.println("������ ������������ ����� " + area);
		
		// 4.5 ����� printSomethingSeveralTimes
		printSomethingSeveralTimes("quantity", 5);
		
		// 5a. ����� ����� ������ ���� �����
		printSumOfEvenDigits(-286);
		
		// 5b.	��������� ������ � �������� ����� �����
		sumOfEvenNumbers(-65433);
		
		// 5c. "���������" �����
		MethodUtils.reverseNumber(68921);
		
		// 5d. ���������� ���������� �����
		MethodUtils.factorialNumber(21); // 21 - ���� �� ������ ����� �.�. �� ������� ����� long. ���� �� ������� �������??
		
		// 5e. ���������� ���������� ������� �����
		int [] arr  = {3, 0, 18, -7, 37, 55, 62, 73, 85, 97};
		MethodUtils.primeNumer(arr);
		
		// 5f. ����� � ������������ ���� �����
		MethodUtils.sumAndMultDigit(456);
		
		// 5g.	���������� ����� � �������
		MethodUtils.degreeNumber(5, 3);
		
		// 5h. ������� ����� �� ����� � ������� ���
		MethodUtils.deletAndReturnDigit(98765, 4);
		
		// 5i. ����� ������ � ��������� ���� �����
		MethodUtils.sumFirstAndLastDigit(135865);
		
		// 5j. ����������, ����� ����� ����� ������
		MethodUtils.maxDigit(103562);
		
		// 5k. ������� �������� �����
		MethodUtils.divisorOfNumbers(88);
		
		// 5l. ����� ������� ASCII
		MethodUtils.tableASCII(2001); // �� �� ����� ������� ������� (��� ������ ��������� � ��� ������ ����������?)
		
		// 5m. ����� ���������� ����� ���� �����
		MethodUtils.comparisoOfNumbers(36, -1306);
	}

}
