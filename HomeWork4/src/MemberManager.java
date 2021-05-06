
public class MemberManager implements MemberService {

	private MemberCheckService memberCheckService;

	public MemberManager(MemberCheckService memberCheckService) {
		super();
		this.memberCheckService = memberCheckService;
	}
	
	
	@Override
	public void add(Member member) {
		if(memberCheckService.CheckIfRealPerson(member)) {
			
		System.out.println(member.getFirsName() +"adlý kullanýcý sisteme eklendi.");
		
	}else {
	       System.out.println("Geçersiz bilgi girdiniz.");	
	}
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirsName() + " adlý kullanýcý sistemden silindi.");
		
	}


	@Override
	public void update(Member member) {
		System.out.println(member.getFirsName() + " kullanýcý bilgileri güncellendi.");
		
	}
	

}

