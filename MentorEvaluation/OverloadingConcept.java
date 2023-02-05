public class OverloadingConcept{

	public static void print(String... datas){

		System.out.println("\nWithOut Overloading");
		for(int i = 0;i<datas.length;++i){
			System.out.print(datas[i]);
		}
	}
	public static void main(String[] args){

		print();
		print("hello");
		print("we"," are"," in"+" Zsgs");
	}
}