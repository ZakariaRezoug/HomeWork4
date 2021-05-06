
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " adl� oyun sisteme eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " adl� oyun g�ncellendi.");
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game : games) {
			System.out.println(game.getName()+ " adl� oyun sisteme eklendi.");
		}
		
	}

}
