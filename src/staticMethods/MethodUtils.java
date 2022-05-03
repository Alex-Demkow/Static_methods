package staticMethods;

public class MethodUtils {

    //������� �����, toUSD(int byr, double course), ����������� ���.�����
	//	� ������� �� ��������� �����. �������� ��� ������ � ������ main() c ������
	//	�����������, ��������� ����������� � �������.
	// 1. ����� toUSD
	
	public static void toUSD(int byn, double course) {
		double usd = byn * course;
		System.out.println("���� ������� = " + usd);
	}

	public static double printToUSD(int byn, double course) {
		return byn * course;
	}

		//	������� ����� toEuro (int byr, double course) , ����������� ���.�����
	//	� ���� �� ��������� �����. �������� ��� ������ � ������ main() c ������
	//	�����������, ��������� ����������� � �������.
	// 2. ����� toEuro
	
	public static void toEuro(int byn, double course) {
		double euro = byn * course;
		System.out.println("���� ���� = " + euro);
	}

	public static double printToEuro(int byn, double course) {
		return byn * course;
	}

	//3.	�� ������� ������� ������ ��������� ���� ����� �� Euro � USD � ��������.
	//	� �������������� �� � ������ main().
	// 3.1 ����� EuroToUSD

	public static void euroToUSD(int euro, double conversion) {
		double usd = euro * conversion;
		System.out.println("��������� ���� � ������� = " + usd);
	}

	public static double printEuroToUSD(int euro, double conversion) {
		return euro * conversion;
	}

	// 3.2 ����� USDToEuro
	public static void USDToEuro(int usd, double conversion) {
		double euro = usd * conversion;
		System.out.println("��������� ������� � ����  = " + euro);
	}

	public static double printUSDToEuro(int usd, double conversion) {
		return usd * conversion;
	}

	//	4. ���������� ������ ������ �� �� �������� � �����.
	// 4.1 ����� printKmToMiles
	public static void printKmToMiles(int km) {
		double mile = km * 0.621371;
		System.out.println(km + " km = " + mile + " mile");
	}

	// 4.2 ����� kmToMiles
	public static double kmToMiles(int km) {
		return km * 0.621371;
	}

	// 4.3 ����� printTrianglePerimeter
	public static void printTrianglePerimeter(int a, int b, int c) {
		int per = a + b + c;
		System.out.println("��������� ������������ ����� " + per);
	}

	// 4.4 ����� getTriangleArea
	public static double getTriangleArea(int a, int b, int c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	// 4.5 ����� printSomethingSeveralTimes
	public static void printSomethingSeveralTimes(String something, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(something);
		}
	}

	//	5.	���������� ������ ������ �� ������� (������ ������� � ��������� �����,
	//	������� ����� ���-�� ������� � ���. return, � ����� �� ���������� void)
	// 5a. ����� ����� ������ ���� �����
	public static void printSumOfEvenDigits(int number) {
		number = Math.abs(number);
		int summ = 0;
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				summ += digit;
			} else {
				summ += 0;
			}
		}
		System.out.println("����� ������ ���� ����� ����� " + summ);
	}

	// 5b. ��������� ������ � �������� ����� �����
	public static void sumOfEvenNumbers(int number) {
		number = Math.abs(number);
		int summEven = 0;
		int summOdd = 0;
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			if (digit == 0) {
				summEven += 0;
			} else if (digit % 2 == 0 && digit != 0) {
				summEven += 1;
			} else {
				summOdd += 1;
			}
		}
		System.out.println("���������� ������ ���� ����� ����� " + summEven + "\n���������� �������� ���� ����� ����� " + summOdd);
	}

	// 5c. "���������" �����
	public static void reverseNumber(int number) {
		number = Math.abs(number);
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			System.out.print(digit);
		}
		System.out.println();
	}

	// 5d. ���������� ���������� �����
	public static void factorialNumber(long number) {
		if (number < 0) {
			System.out.print("��������� ����� ���� �������� ������ ��� ������������� �����");
		} else {
			long factorial = 1;
			for (long i = 1; i < number; i++) {
				factorial = factorial * (i + 1);
			}
			System.out.println("��������� ����� = " + factorial);
		}
	}

	// 5e. ���������� ���������� ������� �����
	public static void primeNumer(int[] number) {
		int primeNum = 0;
		for (int i = 0; i < number.length; i++) {
			int numberOfDivisions = 0;
			for (int j = number[i] - 1; j > 1; j--) {
				if (number[i] % j == 0) {
					numberOfDivisions += 1;
				} else {
					numberOfDivisions = numberOfDivisions;
				}
			}
			if (number[i] <= 1 || numberOfDivisions != 0) {
				primeNum = primeNum;
			} else {
				primeNum += 1;
			}
		}
		System.out.println("���������� ������� ����� = " + primeNum);
	}

	// 5f. ����� � ������������ ���� �����
	public static void sumAndMultDigit(int number) {
		number = Math.abs(number);
		int sumDigit = 0;
		int multDigit = 1;
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			sumDigit += digit;
			multDigit *= digit;
		}
		System.out.println("����� ���� ����� = " + sumDigit);
		System.out.println("������������ ���� ����� = " + multDigit);
	}

	// 5g. ���������� ����� � �������
	public static void degreeNumber(double number, double degree) {
		double newNumber = Math.pow(number, degree);
		System.out.println("����� " + number + " ����������� � ������� " + degree + " ����� " + newNumber);
	}
	
	// 5h. ������� ����� �� ����� � ������� ���
	public static void deletAndReturnDigit(int number, int delElement) {
		StringBuffer s1 = new StringBuffer("" + number);
		if (delElement > s1.length() || delElement <= 0) {
			System.out.println("��������� ����� �� �������� � ������� ��������� ���� ��������");
		} else {
			int unicode = s1.codePointAt(delElement - 1);
			s1.delete(delElement - 1, delElement);
			System.out.println("�� ��������� ����� " + number + " ������� " + delElement + "-� �����. ���������: " + s1);
			StringBuffer s2 = new StringBuffer("" + s1);
			s2.insert(delElement - 1, (char) unicode);
			System.out.println("� ����������������� ����� " + s1 + " ��������� �������� ����� �����." + " ���������: " + s2);
		}
	}

	// 5i. ����� ������ � ��������� ���� �����
	public static void sumFirstAndLastDigit(int number) {
		String s = "" + number;
		int arr[] = new int[s.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; number > 0; number /= 10, j++) {
				int x = number % 10;
				arr[j] = x;
			}
		}
		System.out.println("����� ������ � ��������� ���� = " + (arr[0] + arr[arr.length - 1]));
	}
	
	// 5j. ����������, ����� ����� ����� ������
	public static void maxDigit(int number) {
		String s = "" + number;
		int arr[] = new int[s.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; number > 0; number /= 10, j++) {
				int x = number % 10;
				arr[j] = x;
			}
		}
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("������������ �����: " + max);
	}

	// 5k. ������� �������� �����
	public static void divisorOfNumbers(int number) {
		System.out.print("��������: ");
		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0 && i != 1) {
				System.out.print(i + ", ");
			}
			if (i == 1) {
				System.out.println(i + ".");
			}
		}
	}

	// 5l. ����� ������� ASCII
	public static void tableASCII(int number) { 
		int x = number;
		System.out.println((char) x); 
	}
	
	// 5m. ����� ���������� ����� ���� �����
	public static void comparisoOfNumbers(int number1, int number2) {
		number1 = Math.abs(number1);
		number2 = Math.abs(number2);
		String s1 = "" + number1;
		String s2 = "" + number2;
		System.out.print("���������� ����� ���� �����: ");
			for (int i = 0; number2 > 0; number2 /= 10, i++) {
				int x = number2 % 10;
				String strX = "" + x;		
				if (s1.indexOf(strX) >= 0) { 
					System.out.print(x + ", ");
			}
		}
		
	}
}
