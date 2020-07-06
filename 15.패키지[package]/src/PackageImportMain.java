import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
*/
/*
	import com.itwill.shop.member.*;
 		- com.itwill.shop.member package에있는 모든클래스 import한다.
 		- com.itwill.shop.member package의 하위패키지에있는 클래스를  import하지는않는다
 		- com.* (하위패키지 클래스 import 안함)
 */
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;

//import com.itwill.shop.admin.Member;
/*
 * 줄인클래스의이름이동일한 클래스는 import문에 2개동시에기술불가능
 */

import com.itwill.shop.order.Order;
/*
 *  << import 단축키 >>
 *  ctrl + shift + o
 */

public class PackageImportMain {

	public static void main(String[] args) {
		Member m1=new Member();
		System.out.println(m1);
		MemberService memverService = new MemberService();
		System.out.println(memverService);
		
		com.itwill.shop.admin.Member am1 = new com.itwill.shop.admin.Member();
		System.out.println(am1);
		Order order = new Order();
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		
	}

}
