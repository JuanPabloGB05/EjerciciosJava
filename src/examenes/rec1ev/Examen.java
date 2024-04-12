package examenes.rec1ev;

public class Examen {

	public static void main(String[] args) {
		System.out.println(centro(new int[] {6, 2, 3, 0, 1}));
		System.out.println(centro(new int[] {1, 2, 1, 1}));
	}

	static Integer centro(int[] v) {
		for (int c=0; c<v.length; c++) {
			int sumaIzda = 0;
			for (int i=0; i<c; i++) {
				sumaIzda += (c - i) * v[i];
			}
			int sumaDcha = 0;
			for (int j=c+1; j<v.length; j++) {
				sumaDcha += (j - c)* v[j];
			}
			if (sumaIzda == sumaDcha)
				return c;
		}
		return null;
	}
	
}
