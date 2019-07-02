package server;

import java.io.IOException;

import javax.xml.ws.Endpoint;

import config.Configuration;
import service.Bibliotheque;;

public class ServerBibliothequeJWS {

	public static void main(String[] args) throws IOException {

		Configuration conf = new Configuration();
		
		
		String url = conf.getUrl();
		Endpoint.publish(url, new Bibliotheque());
		System.out.println(url);
	
	}
}
