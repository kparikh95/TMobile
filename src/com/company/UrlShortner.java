package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UrlShortner {

    private Map<String,String> hm= new HashMap<String,String>();
    private String alphabet= "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random random= new Random();


    public String getRandomKey(){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<6;i++){
            sb.append(alphabet.charAt(random.nextInt(62)));
        }
        return sb.toString();
    }



    public String encode(String longURL){
        String key= getRandomKey();
        while(hm.containsKey(key)){
            key=getRandomKey();
        }
        //Add code for custom URL
        hm.put(key,longURL);
        return "https://tmobile.com/"+ key;
    }

    public String decode(String shortURL){
        return hm.get(shortURL.replace("https://tmobile.com/",""));
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the long URL");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        UrlShortner u1= new UrlShortner();
        String shortURL= u1.encode(reader.readLine());
        System.out.println("Short URL is:"+ shortURL);
        System.out.println(u1.decode(shortURL));
    }
}
