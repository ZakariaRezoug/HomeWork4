
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " adlý oyun sisteme eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " adlý oyun güncellendi.");
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game : games) {
			System.out.println(game.getName()+ " adlý oyun sisteme eklendi.");
		}
		
	}

}
