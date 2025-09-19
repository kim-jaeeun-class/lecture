package kr.or.human3;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor	// 아래의 전달 인자를 받을 수 있는 생성자를 만듦
//@EqualsAndHashCode
@Data	// 위의 모든 것을 한 번에 처리하는 annotation
public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String tel;
	private String addr;

}
