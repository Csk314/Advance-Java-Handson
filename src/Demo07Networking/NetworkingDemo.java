package Demo07Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
	public static void main(String[] args) throws UnknownHostException {
		String Url = "www.google.com";
		InetAddress inetAddress = Inet4Address.getByName(Url);
		System.out.println("Address:  " + Arrays.toString(inetAddress.getAddress()));
		System.out.println("Host Address: " + inetAddress.getHostAddress());
		System.out.println("isAnyLocalAddress :" + inetAddress.isAnyLocalAddress());

		System.out.println("isLinkLocalAddress :" + inetAddress.isLinkLocalAddress());

		System.out.println("isLoopBackAddress :" + inetAddress.isLoopbackAddress());

		System.out.println("isSiteLocalAddress :" + inetAddress.isSiteLocalAddress());

		System.out.println("isMultiCastAddress :" + inetAddress.isMulticastAddress());

		System.out.println("Hashcode :" + inetAddress.hashCode());
	}
}
