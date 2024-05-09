package hyun;

public class Main_hyun02 {

	public static void main(String[] args) {
		
		MemberDAO mdao = new MemberDAO();
				
		
		boolean clear = false;
		
		
		if(!clear) {
			mdao.goPerfect();
		};
		
		
		
		
		System.out.println("완성된 dao " + mdao);
	}

}
