package com.oc.ws;

import java.io.IOException;

import com.oc.ws.config.Configuration;
import com.oc.ws.wsService.Bibliotheque;

import javax.xml.ws.Endpoint;

public class MainApp {
   public static void main(String[] args) throws IOException {
      Configuration conf = new Configuration();

      String url = conf.getUrl();
      Endpoint.publish(url, new Bibliotheque());
      System.out.println(url);

   }
}
