public class CS245A2{


	//Main Driver Class to match project description  
	public static void main(String[] args){

		//Verifies CMD argument arary is of exactly length 1 // one argument check //
		if(args.length > 1 || args.length < 1){
			System.out.println("INVALID CMD ARGUMENTS");
			System.exit(0);//terminate
		}

		Main main = new Main(args[0]);
		main.start();
	}
}