

public class SaleManager implements SaleService,CampaingService{

	@Override
	public void add(Sale sale, Game game) {
		game.setPrice((game.getPrice()*sale.getPercentage())/100);
		System.out.println("Oyunun indirim sonras� fiyat� : " + game.getPrice() + " tl olmu�tur.");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getName() + " adl� indirim kald�r�lm��t�r.");
		
	}

	@Override
	public void update(Sale sale, Game game) {
		game.setPrice((game.getPrice()*sale.getPercentage())/100);
		System.out.println("Oyunun g�ncellenen indirim sonras� fiyat� : " + game.getPrice() + " tl olmu�tur.");
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyas� eklenmi�tir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyas� silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyas� g�ncellenmi�tir.");
		
	}
}
