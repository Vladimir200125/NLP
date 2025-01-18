// Варинаты лямбда-функиций:
//() -> 100.2;
//() -> Math.random() * 100;
//(n) -> 1.5/n;
//(n) -> (n%2)==0;
//
//Функциональный интерфейс:
interface MyValue {
	// В функциональном мнтерфейсе может бытьтолько один фбстрактный метод 
	double getValue();
}
interface MyParamValue {
	// Определяем метод с одним целым параметром
	double getPValue (int n);
}
interface NumericTest {
	boolean test(int n, int m);
}
class Lambda {
	public static void main(String[] args) {
	       	MyValue myVal;
		myVal = () -> 100.6;	       
		System.out.println ("Значение 1: " + myVal.getValue());
		myVal = () -> Math.random() * 8*10.5;
		System.out.println ("Значение 2: " + myVal.getValue());	
		//Пример использование функционального интерфейса с одним пораметром
		MyParamValue myPVal;
		myPVal = (n) -> 2.0/n;
		System.out.println ("Значение 1 для интерфейса с параметром: " + myPVal.getPValue(10));
		// Пример интерфейса с двумя параметрами
		// Проверка на деление:
		NumericTest isFactor = (n,d) -> (n%d)==0;

		if(isFactor.test(10,2))
				System.out.println("2 является делителем 10");
		if(!isFactor.test(10,3))
                                System.out.println("3 не является делителем 10");
		 //
		NumericTest lessThan = (n,m) -> (n<m);

                if(lessThan.test(2,10))
                                System.out.println("2 меньше 10");
                if(!lessThan.test(50,2))
                                System.out.println("50 не меньше 2");
		//Проверка на равенство обсолютных значений
		NumericTest absEqual = (n, m) -> (n<0 ? -n : n) == (m<0 ? -m : m);
		int x1, x2;
		x1 =4;
		x2 = -4;
		if (absEqual.test(x1, x2))
			System.out.println("");
		else
			System.out.println("");
		x1 = 5;
                x2 = 6;
                if (absEqual.test(x1, x2))
                        System.out.println("");
                else
			System.out.println("");


	}
}
