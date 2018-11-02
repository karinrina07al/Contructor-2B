public class Ciwidey extends Coffe{
	
	public int harga;

	public Ciwidey(String rasaCoffe, int harga){
		super(rasaCoffe);		
		this.harga = harga;
	}

	public Ciwidey(String rasaCoffe){
		super(rasaCoffe);
	}


	public void showHarga(){
		System.out.println("Harga =" +harga);
	}

}