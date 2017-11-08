package java;

public class Operation {

	private char symobole;
	final static int max = 10000;
	final static int min = -10000;
	public Operation (char symbole)
	{
		Pile p = new Pile(10);
	}
	public void addition(Pile p , char symbole)
	{
		int tmp1 , tmp2 ; 
		tmp1 = p.v[p.sommet];
		tmp2 = p.v[p.sommet-1];
		p.depiler();
		p.depiler();
		System.out.println(" L'adition des deux valeurs sont " + tmp1 +", " + tmp2);
		tmp2 = tmp1 + tmp2;
		System.out.println("On empile " + tmp2 );
		p.empiler(tmp2);
	}
	public void multi(Pile p , char symbole)
	{
		int tmp1 , tmp2 ; 
		tmp1 = p.v[p.sommet];
		tmp2 = p.v[p.sommet-1];
		p.depiler();
		p.depiler();
		System.out.println(" La multiplication des deux valeurs sont " + tmp1 +", " + tmp2);
		tmp2 = tmp1 * tmp2;
		System.out.println("On empile " + tmp2 );
		p.empiler(tmp2);
	}
	
	
	
}

