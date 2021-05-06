
public class Main {

	public static void main(String[] args) {
		Member member = new Member(1, "Zakaria","Rezoug", 1993,12345678910L);
		MemberManager memberManager = new MemberManager(new MemberCheckManager()); 
		memberManager.add(member);
		
		Campaign campaing1 = new Campaign(1,"Yaz","Yaza özel tüm ürünlerde süpriz hediyeler.");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaing1);
		
		Game game1 = new Game(1, "COD", 450);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Sale sale1 = new Sale(1,"Yaz",40);
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale1, game1);
		
			
		
		
	

}}
	
