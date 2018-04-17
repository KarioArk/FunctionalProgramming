package higherorder;

import org.junit.Test;

public class RestClientSpec {

    @Test
    public void shouldMakeWebserviceCall() throws Exception {
        RestClient restClient = new RestClient();
        restClient.randomJoke();
        restClient.locationFor("Chennai");
    }
}
