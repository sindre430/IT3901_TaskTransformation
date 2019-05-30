public class EditTest {
	public static void main(String[] args) { //{edit, input:"args", output:"ARGS"}
		//{edit, output:"System.out.println("test")"}
		for(int i=0; i<10; i++) { //{edit, output:"0", input:5}
			System.out.println(i); //{edit, input:"ln"}
			System.out.println("---"); //{edit, input:33-36, output:"..."}
		}
	}
}
