package api_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class API_Main {
    private static final String API_KEY = "API-KEY";

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

        System.out.println(url.toString());

        ObjectMapper mapper = new ObjectMapper();

        // reading from Reader

        try(
                InputStream inStream = url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        ){
//            inStream.close();
//            String line;
//            while ((line = reader.readLine()) != null){
//                  System.out.println(line);
//            }
            Map m = mapper.readValue(reader, Map.class);

            System.out.println(m);

            String label1 = (String) ((Map) ((List) m.get("items")).get(0)).get("title");
            System.out.println(label1);

        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("GET request issue.");
        }

        // reading from url

        try {
            Response response1 = mapper.readValue(url, Response.class);
            System.out.println(response1);
            System.out.println("id: " + response1.getItems().get(0).getId());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("GET request issue.");
        }

    }
    static class Response {
        private List<Item> items;

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        @Override
        public String toString() {
            return "Response{" +
                    "items=" + items +
                    '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Item {
        String title;
        String id;
        String ontologyId;
        String resultType;

        public String getOntologyId() {
            return ontologyId;
        }

        public void setOntologyId(String ontologyId) {
            this.ontologyId = ontologyId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getResultType() {
            return resultType;
        }

        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "title='" + title + '\'' +
                    ", id='" + id + '\'' +
                    ", ontology='" + ontologyId + '\'' +
                    ", resultType='" + resultType + '\'' +
                    '}';
        }
    }
}
