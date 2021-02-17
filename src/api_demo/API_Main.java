package api_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class API_Main {
    private static final String API_KEY = "API-KEY-HERE";

    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {

//        https://discover.search.hereapi.com/v1/
//                discover
//                ?at=52.5228,13.4124
//                &q=petrol+station
//                &lang=en-US
//                &apiKey={YOUR_API_KEY}

        String search = "petrol station";

        URL url = new URL("https://discover.search.hereapi.com/v1/discover" +
                "?at=52.5228,13.4124" +
                "&q=" + URLEncoder.encode(search, StandardCharsets.UTF_8) +
                "&lang=en-US" +
                "&apiKey=" + API_KEY);

        try {
            InputStream inStream = url.openStream();
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("GET request issue.");
        }

    }
}
