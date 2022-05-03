package staticMethods;

public class MethodUtils {

    //Создать метод, toUSD(int byr, double course), переводящий бел.рубли
	//	в доллары по заданному курсу. Вызовите его дважды в методе main() c любыми
	//	параметрами, результат напечатейте в консоль.
	// 1. метод toUSD
	
	public static void toUSD(int byn, double course) {
		double usd = byn * course;
		System.out.println("Курс доллара = " + usd);
	}

	public static double printToUSD(int byn, double course) {
		return byn * course;
	}

		//	Создать метод toEuro (int byr, double course) , переводящий бел.рубли
	//	в евро по заданному курсу. Вызовите его дважды в методе main() c любыми
	//	параметрами, результат напечатайте в консоль.
	// 2. метод toEuro
	
	public static void toEuro(int byn, double course) {
		double euro = byn * course;
		System.out.println("Курс евро = " + euro);
	}

	public static double printToEuro(int byn, double course) {
		return byn * course;
	}

	//3.	По подобию создать методы конверсии двух валют из Euro в USD и наоборот.
	//	И протестировать их в методе main().
	// 3.1 метод EuroToUSD

	public static void euroToUSD(int euro, double conversion) {
		double usd = euro * conversion;
		System.out.println("Конверсия евро к доллару = " + usd);
	}

	public static double printEuroToUSD(int euro, double conversion) {
		return euro * conversion;
	}

	// 3.2 метод USDToEuro
	public static void USDToEuro(int usd, double conversion) {
		double euro = usd * conversion;
		System.out.println("Конверсия доллара к евро  = " + euro);
	}

	public static double printUSDToEuro(int usd, double conversion) {
		return usd * conversion;
	}

	//	4. Реализуйте методы исходя из их названий и типов.
	// 4.1 метод printKmToMiles
	public static void printKmToMiles(int km) {
		double mile = km * 0.621371;
		System.out.println(km + " km = " + mile + " mile");
	}

	// 4.2 метод kmToMiles
	public static double kmToMiles(int km) {
		return km * 0.621371;
	}

	// 4.3 метод printTrianglePerimeter
	public static void printTrianglePerimeter(int a, int b, int c) {
		int per = a + b + c;
		System.out.println("Перриметр треугольника равен " + per);
	}

	// 4.4 метод getTriangleArea
	public static double getTriangleArea(int a, int b, int c) {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	// 4.5 метод printSomethingSeveralTimes
	public static void printSomethingSeveralTimes(String something, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(something);
		}
	}

	//	5.	Реализуйте методы исходя из заданий (каждое задание – отдельный метод,
	//	который может что-то вернуть с пом. return, а может не возвращать void)
	// 5a. Найти сумму четных цифр числа
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
		System.out.println("Сумма четных цифр числа равна " + summ);
	}

	// 5b. Посчитать четные и нечетные цифры числа
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
		System.out.println("Количество четных цифр числа равно " + summEven + "\nКоличество нечетных цифр числа равно " + summOdd);
	}

	// 5c. "Переворот" числа
	public static void reverseNumber(int number) {
		number = Math.abs(number);
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			System.out.print(digit);
		}
		System.out.println();
	}

	// 5d. Вычисление факториала числа
	public static void factorialNumber(long number) {
		if (number < 0) {
			System.out.print("Факториал может быть вычислен только для положительных чисел");
		} else {
			long factorial = 1;
			for (long i = 1; i < number; i++) {
				factorial = factorial * (i + 1);
			}
			System.out.println("Факториал числа = " + factorial);
		}
	}

	// 5e. Определить количество простых чисел
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
		System.out.println("Количество простых чисел = " + primeNum);
	}

	// 5f. Сумма и произведение цифр числа
	public static void sumAndMultDigit(int number) {
		number = Math.abs(number);
		int sumDigit = 0;
		int multDigit = 1;
		for (; number > 0; number /= 10) {
			int digit = number % 10;
			sumDigit += digit;
			multDigit *= digit;
		}
		System.out.println("Сумма цифр числа = " + sumDigit);
		System.out.println("Произведение цифр числа = " + multDigit);
	}

	// 5g. Возведение числа в степень
	public static void degreeNumber(double number, double degree) {
		double newNumber = Math.pow(number, degree);
		System.out.println("Число " + number + " возведенное с степень " + degree + " равно " + newNumber);
	}
	
	// 5h. Удалить цифру из числа и вернуть его
	public static void deletAndReturnDigit(int number, int delElement) {
		StringBuffer s1 = new StringBuffer("" + number);
		if (delElement > s1.length() || delElement <= 0) {
			System.out.println("Удаляемая цифра не попадает в пределы заданного вами значения");
		} else {
			int unicode = s1.codePointAt(delElement - 1);
			s1.delete(delElement - 1, delElement);
			System.out.println("Из исходного числа " + number + " удалена " + delElement + "-я цифра. Результат: " + s1);
			StringBuffer s2 = new StringBuffer("" + s1);
			s2.insert(delElement - 1, (char) unicode);
			System.out.println("В отредактированное число " + s1 + " вставлена удаленая ранее цифра." + " Результат: " + s2);
		}
	}

	// 5i. Сумма первой и последней цифр числа
	public static void sumFirstAndLastDigit(int number) {
		String s = "" + number;
		int arr[] = new int[s.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; number > 0; number /= 10, j++) {
				int x = number % 10;
				arr[j] = x;
			}
		}
		System.out.println("Сумма первой и последней цифр = " + (arr[0] + arr[arr.length - 1]));
	}
	
	// 5j. Определить, какая цифра числа больше
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
		System.out.println("Максимальная цифра: " + max);
	}

	// 5k. Вывести делители чисел
	public static void divisorOfNumbers(int number) {
		System.out.print("Делитель: ");
		for (int i = number - 1; i > 0; i--) {
			if (number % i == 0 && i != 1) {
				System.out.print(i + ", ");
			}
			if (i == 1) {
				System.out.println(i + ".");
			}
		}
	}

	// 5l. Вывод таблицы ASCII
	public static void tableASCII(int number) { 
		int x = number;
		System.out.println((char) x); 
	}
	
	// 5m. Найти одинаковые цифры двух чисел
	public static void comparisoOfNumbers(int number1, int number2) {
		number1 = Math.abs(number1);
		number2 = Math.abs(number2);
		String s1 = "" + number1;
		String s2 = "" + number2;
		System.out.print("Одинаковые цифры двух чисел: ");
			for (int i = 0; number2 > 0; number2 /= 10, i++) {
				int x = number2 % 10;
				String strX = "" + x;		
				if (s1.indexOf(strX) >= 0) { 
					System.out.print(x + ", ");
			}
		}
		
	}
}
