
public class MemberManager implements MemberService {

	private MemberCheckService memberCheckService;

	public MemberManager(MemberCheckService memberCheckService) {
		super();
		this.memberCheckService = memberCheckService;
	}
	
	
	@Override
	public void add(Member member) {
		if(memberCheckService.CheckIfRealPerson(member)) {
			
		System.out.println(member.getFirsName() +"adl� kullan�c� sisteme eklendi.");
		
	}else {
	       System.out.println("Ge�ersiz bilgi girdiniz.");	
	}
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirsName() + " adl� kullan�c� sistemden silindi.");
		
	}


	@Override
	public void update(Member member) {
		System.out.println(member.getFirsName() + " kullan�c� bilgileri g�ncellendi.");
		
	}
	

}

