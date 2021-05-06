

public class SaleManager implements SaleService,CampaingService{

	@Override
	public void add(Sale sale, Game game) {
		game.setPrice((game.getPrice()*sale.getPercentage())/100);
		System.out.println("Oyunun indirim sonrasý fiyatý : " + game.getPrice() + " tl olmuþtur.");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getName() + " adlý indirim kaldýrýlmýþtýr.");
		
	}

	@Override
	public void update(Sale sale, Game game) {
		game.setPrice((game.getPrice()*sale.getPercentage())/100);
		System.out.println("Oyunun güncellenen indirim sonrasý fiyatý : " + game.getPrice() + " tl olmuþtur.");
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyasý eklenmiþtir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyasý silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+ " kampanyasý güncellenmiþtir.");
		
	}
}
