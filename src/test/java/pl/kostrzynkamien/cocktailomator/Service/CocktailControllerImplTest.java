package pl.kostrzynkamien.cocktailomator.Service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.kostrzynkamien.cocktailomator.Model.FavouriteCocktail;
import pl.kostrzynkamien.cocktailomator.Model.Recipe;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CocktailControllerImplTest {

    @Spy
    private CocktailControllerImpl cocktailControllerImpl;

    private List<Recipe> prepareMockData(){
        List<Recipe>favouriteCocktailList=new ArrayList<>();
        Recipe favouriteCocktail1 = new Recipe("white russian", "ordinary drink","alcoholic","old-fashioned glass","Pour vodka and coffee liqueur over ice cubes in an old-fashioned glass. Fill with light cream and serve.",
                "https://www.thecocktaildb.com/images/media/drink/vsrupw1472405732.jpg", "vodka","coffee liqueur","light cream",null,
                null,null,null,null,null,null,null,null,null,null,null,"2 oz",
                "1 oz",null,null,null,null,null,null,null,null,null,null,null,null,null,"",
                "","","","","","","","","","","","","","","");

        Recipe favouriteCocktail2 = new Recipe("blue margarita", "ordinary drink","alcoholic","cocktail class","Rub rim of cocktail glass with lime juice. Dip rim in coarse salt. Shake tequila, blue curacao, and lime juice with ice, strain into the salt-rimmed glass, and serve.",
                "https://www.thecocktaildb.com/images/media/drink/qtvvyq1439905913.jpg", "tequila","blue curacao","lime juice","salt",
                null,null,null,null,null,null,null,null,null,null,null,"1 1/2 oz",
                "1 oz","1 oz","coarse",null,null,null,null,null,null,null,null,null,null,null,"","","",
                "","","","","","","","","","","","","");
        favouriteCocktailList.add(favouriteCocktail1);
        favouriteCocktailList.add(favouriteCocktail2);
        return favouriteCocktailList;
    }

    @Test
    public void getRecipies() {
    //    given(cocktailControllerImpl.getRecipies(any(URL.class))).willReturn(prepareMockData());
    //    Assert.assertThat(cocktailControllerImpl.getRecipies("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita"), Matchers.anything());
    }

    @Test
    public void getIngredientInfo() {


    }
}