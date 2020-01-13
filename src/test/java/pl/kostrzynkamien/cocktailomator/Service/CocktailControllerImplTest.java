package pl.kostrzynkamien.cocktailomator.Service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CocktailControllerImplTest {

    @Spy
    private CocktailControllerImpl cocktailControllerImpl;

    private String prepareMockData() {
        return "\"Kahlúa is a coffee-flavored liqueur from Mexico. The drink contains rum, sugar, vanilla bean, and Arabica coffee.\\r\\n\\r\\nPedro Domecq began producing Kahlúa in 1936. It was named Kahlúa, meaning \\\"House of the Acolhua people\\\" in the Veracruz Nahuatl language spoken before the Spanish Conquest. Kahlúa was Hispanicized as Ulúa, forming the name of the modern San Juan de Ulúa fortress.\\r\\n\\r\\nThe company merged in 1994 with Allied Lyons to become Allied Domecq. In turn, that company was partially acquired in 2005 by Pernod Ricard, the largest spirits distributor in the world since its merger with the Swedish Vin & Sprit in March 2008.\\r\\n\\r\\nSince 2004, the alcohol content of Kahlúa is 20.0%; earlier versions had 26.5%. In 2002, a more expensive, high-end product called \\\"Kahlúa Especial\\\" became available in the United States, Canada and Australia after previously being offered only in duty-free markets. Made with premium Arabica coffee beans grown in Veracruz, Mexico, Kahlúa Especial has an alcohol content of 36%, has a lower viscosity, and is less sweet than the regular version.\"";
    }


    @Test
    public void getRecipies() {
        TestRestTemplate testRestTemplate = new TestRestTemplate();
        ResponseEntity<String> response = testRestTemplate.getForEntity("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita" + "/1", String.class);
        Assert.assertThat(cocktailControllerImpl.getRecipies("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"), Matchers.anything());
    }

    @Test
    public void getIngredientInfo() {
        given(cocktailControllerImpl.getIngredientInfo(any(String.class))).willReturn(prepareMockData());
        Assert.assertThat(cocktailControllerImpl.getIngredientInfo("kahlua"), Matchers.anything());

    }
}