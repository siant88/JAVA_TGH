package Day08.Ex06_Multiplelnterface;

public interface Searchable {
   //채널검색
	// : 검색어에 해당하는 채널번호를 반환
	int channelSearch(String keyword);
	
	//컨텐츠 검색
	// : 검색어에 해당하는 컨텐츠를 반환
	
	String[] contentSearch(String keyword);
	
	
}
