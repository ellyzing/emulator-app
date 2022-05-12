import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class ApacheHttpClientPost {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
            // post request
            var request = new HttpPost("https://ib19-4.com");
            request.setHeader("Name", "Denis");
            request.setHeader("CVV", "000");
            request.setHeader("Pin", "0000");
            // Data ( key + value )
            request.setEntity(new StringEntity("My test data"));

            HttpResponse response = client.execute(request);
            
            // exec request + get respons + read response v terminal
            var bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            var builder = new StringBuilder();

            String line;

            while ((line = bufReader.readLine()) != null) {

                builder.append(line);
                builder.append(System.lineSeparator());
            }

            System.out.println(builder);
        }
    }
}
