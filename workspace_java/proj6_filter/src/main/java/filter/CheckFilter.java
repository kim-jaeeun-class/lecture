package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 주소를 썼을 경우 필터가 작동해 어디론가로 보냄
// 보통 아래처럼 * 표시 : 이 경우 모든 것이 필터를 거쳐 감
//		(서버<->[컨트롤러, jsp, 정적 파일]을 거치는 과정 사이에 진행)

@WebFilter("/*")
public class CheckFilter implements Filter {

    public CheckFilter() {
    	System.out.println("CheckFilter 생성자 실행");
    }
    
    // 소멸자
	public void destroy() {
		System.out.println("destroy 소멸자 실행");
	}
	
	// 실질적인 필터 작업이 이루어지는 곳(이 부분이 가장 중요)
	// ServletRequest : 부모
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Servlet 실행 전 시간 확인용
		long before = System.currentTimeMillis();
		
		System.out.println("chain.doFilter 실행 전");
		
		
		// 요청 한글 깨짐 처리 이쪽에서 사용 가능
		request.setCharacterEncoding("utf-8");
		// 그림, json 등에서 아래 코드 때문에 제대로 작동하지 않을 수 있음
		// 모든 것을 html로 응답하기 때문에 가급적 이쪽에서 사용 X
		// json 등은 json으로 응답하도록 설정해야 함
//		response.setContentType("text/html; charset=utf-8");
		
		// 서블릿 주소를 얻기 위한 코드
		// 이를 활용해 로그인 후 MainServlet으로 접근했는지, 바로 MainServlet으로 접근했는지 파악 가능
		// 지금 전달인자가 HttpServletRequest / HttpServletResponse 가 아니라
		// ServletRequest / ServletResponse라 형 변환까지 처리(아래 1~2번째 줄)
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		String path = req.getServletPath();
		System.out.println("path : " + path);
		// 로그인 없이 갈 수 있음(=세션 없이 접근 허용)
		// path가 /login.html과 같다면 chain.doFilter 실행
		// path 주소를 "/login.html"로만 적용해두면 로그인 안 했을 경우 css, js를 확인 불가한 경우가 발생
		// 같은지 확인해야 할 주소가 너무 많으면 폴더를 만들어 그 안에 넣은 후,
		// indexOf를 적용한 폴더 주소로 같은지 판별하도록 할 수 있음(*)
		// 혹은 startsWith를 사용하는 것도 가능 : 최하단의 isExclude 참고
		if(isExclude(path)) {
			chain.doFilter(request, response);
		}
		// 아닐 경우(로그인이 필수인 경우)
		else {
			// 세션 가져오기 : getSession()
//			HttpSession session = req.getSession(false);
//			// 세션이 null이면 로그인 페이지로 이동
//			if(session == null) {
//
//			}
			// LoginServlet에서 세션 설정됐는지 확인
			HttpSession session = req.getSession();
			String login = (String)session.getAttribute("login");
			
			// login 세션의 value가 Y면 실행
			if("Y".equals(login)) {
				chain.doFilter(request, response);
			}
			else {
				 System.out.println("세션이 없어서(로그인이 되지 않아) 통과 불가");
				// 상대 주소 이슈 발생하지 않도록 req.getContextPath() 사용
				resp.sendRedirect(req.getContextPath() + "/login.html");
			}
		}
		
//		// Servlet 호출 코드. 없애거나 주석 처리 시 응답이 없어 404로 처리됨.
		// 위에 if문으로 실행 여부를 결정하게 됐으므로 주석 처리
//		chain.doFilter(request, response);
//		System.out.println("chain.doFilter 실행 후");
		
		// Servlet 실행 후 시간 확인용
		long after = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (after - before));
	}

	// init() : 생성자 실행 후 바로 실행
	public void init(FilterConfig fConfig) throws ServletException {

	}
	
	// 메소드로 path 주소 확인 : 코드 간결화를 위해 사용하는 것으로, doFilter에서 if() 조건 작성란에 써도 됨
	private boolean isExclude(String path) {
		// 기본값을 false로
		boolean result = false;
		
		// 주소가 같으면 true로
		if(	   path.equals("/login.html")
			|| path.equals("/login")
			|| path.startsWith("/assets")
		) {
			result = true;
		}
		
		return result;
	}

}
