package j18_예외;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User {// 내부 클래스가 아님. 별도의 클래스를 만든 것. public class안에 있는 서브 클래스. 접근지시자가 default
	private String username;
	private String password;

}

public class UserListException {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<>();

		userList.add(new User("aaa", "1111"));
		userList.add(new User("bbb", "2222"));
		userList.add(new User("ccc", "3333"));
		userList.add(new User("ddd", "4444"));
		userList.add(null);

		int length = userList.size();

		try {
			for (int i = 0; i < length; i++) {
				System.out.println(userList.get(i));
			}

			for (int i = 0; i < length; i++) {
				System.out.println("username: " + userList.get(i).getUsername());// 위의 오류- 예외 때문에 여기가 실행 안됨
				System.out.println("password: " + userList.get(i).getPassword());
			}

		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {// 리스트에서 문제 생길 때
			length -= 1;
			System.out.println(indexOutOfBoundsException.getMessage());
			try {
				for (int i = 0; i < length; i++) {
					System.out.println("username: " + userList.get(i).getUsername());
					System.out.println("password: " + userList.get(i).getPassword());
				}
			} catch (NullPointerException nullPointerException) {// 마지막 인덱스가 null이므로 null에 get(i).getUsername,
																	// getPassword하려면 null pointer exception이 생김. 길이가 하나
																	// 더 길 때
				System.out.println(nullPointerException.getMessage());
			}

		}
		catch (NullPointerException nullPointerException) {//길이가 원래대로일 때 얘가 실행됨
			System.out.println(nullPointerException.getMessage());
		}
		
		catch (Exception e) {// catch 마지막에는 Exception이 있어야 함. 모든 예외를 업캐스팅해서 처리할 수 있다. 미처 예상하지 못한 예외를 처리하기 위해
								// 씀. 로그를 남김. 처리되지 않은 예외가 없으면 실행되지 않는다
			e.printStackTrace();// 어디에서 문제가 생겼는지 알 수 있음.
		} finally {//예외가 있든 없든 무조건 마지막에 실행되는 부분 
			System.out.println("무조건 실행");//여기엔 데이터 자동 저장 등을 실행되도록 한다.
		}
			System.out.println("예외가 처리 안되면 실행 안됨");
		System.out.println("프로그램 정상 종료");
	}

}
