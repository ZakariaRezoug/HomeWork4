
public class CampaignManager implements CampaingService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya sisteme eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya sistemden silindi.");
		
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya g�ncellendi.");
		
	}

}
