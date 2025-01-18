interface NumericFunc {
	int func(int n);
}
class fail2 {
	public static void main(String[] args) {

		NumericFunc smallestF = (n) -> {
			int result = 1;

			n = n<0 ? -n : n;
			for (int i=2; i<=n/i; i++)
				if((n%i)==0) {
					result = i;
					break;
				}
			return result;

		};
		System.out.println("Наименьший делитель 12: " + smallestF.func(12));
		System.out.println("Наименьший делитель 11: " + smallestF.func(11));


	}
}
