package classex;

// 외부에서 요청 처리


public class MemberService {

	final int MAX_CNT=100;
			int cnt=0;
			
	Member[] member = new Member[MAX_CNT];
  
	public  void inputData() {
		System.out.println("회원입력");
		System.out.print("ID : ");
		String id = InputScanner.sc.next();
		System.out.print("PWD : ");
		String pwd = InputScanner.sc.next();
	//입력한 내용을 객체로 생성 후 저장
		System.out.print("EMAIL : ");	
		String email = InputScanner.sc.next();
		member[cnt++] = new Member(id,pwd,email);
		System.out.println("데이터 입력이 완료되었습니다.");
		
	}
		
	
	
	public  void searchData() {
		//이름으로 검색한다
		//검색:compareTo()메소드 사용한다
		//삭제, 변경 사용시 자료를 검색한다
		//공통 메소드 작성(serch(String name)
		System.out.println("데이터 검색합니다");
		System.out.print("ID : ");
		String id = InputScanner.sc.next();
		int index=search(id);
		if(index<0)
			System.out.println("데이터가 없음");
		else {
		// 해당 검색 데이터를 출력한다
		   
		    System.out.println( member[index].toString());
		   System.out.println("데이터 검색 완료");
		}
	}
	private  int search(String id) {
		//매개변수 id과 배열에 있는 id 비교
		for(int i=0; i<cnt; i++) {
			
			Member mem = member[i];
			if(id.compareTo(mem.getId())==0	) 	
				return i;
		}
		return -1;
	}



	public  void updateData() {
		System.out.println("회원을 변경합니다");
		System.out.print("ID : ");
		String id = InputScanner.sc.next();
		int index = search(id);
		System.out.print("ID : ");
		String id2 = InputScanner.sc.next();		
		System.out.print("PWD : ");
		String pwd = InputScanner.sc.next();
	//입력한 내용을 객체로 생성 후 저장
		System.out.print("EMAIL : ");	
		String email = InputScanner.sc.next();
		member[index] = new Member(id2,pwd,email);
		System.out.println("데이터 입력이 완료되었습니다.");
		
	}
	
	public void deleteData() {
		System.out.println("데이터를 삭제합니다.");
		System.out.print("ID : ");
		String id = InputScanner.sc.next();
		int index = search(id);
		if(index<0)
			System.out.println("데이터가 없음");
		else {
		// 해당 검색 데이터를 출력한다
		   for (int i = index; i < cnt; i++) {
			
			   member[i]=member[i+1];
		}
		   cnt--;
		   System.out.println("데이터 삭제완료.");
		}
	}
	
	public  void totalPrint() {
		
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(member[i]);
		}
	}
	
	
		
		
	
	
	
}
