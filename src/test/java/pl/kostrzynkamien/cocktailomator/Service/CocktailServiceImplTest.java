package pl.kostrzynkamien.cocktailomator.Service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import pl.kostrzynkamien.cocktailomator.Model.FavouriteCocktail;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocktailServiceImplTest {

    private List<FavouriteCocktail> prepareMockData(){
        List<FavouriteCocktail>favouriteCocktailList=new ArrayList<>();
        FavouriteCocktail favouriteCocktail1 = new FavouriteCocktail("white russian", "ordinary drink","alcoholic","old-fashioned glass","Pour vodka and coffee liqueur over ice cubes in an old-fashioned glass. Fill with light cream and serve.",
                "https://www.thecocktaildb.com/images/media/drink/vsrupw1472405732.jpg", "vodka","coffee liqueur","light cream",null,
                null,null,null,null,null,null,null,null,null,null,null,"2 oz",
                "1 oz",null,null,null,null,null,null,null,null,null,null,null,null,null);

        FavouriteCocktail favouriteCocktail2 = new FavouriteCocktail("blue margarita", "ordinary drink","alcoholic","cocktail class","Rub rim of cocktail glass with lime juice. Dip rim in coarse salt. Shake tequila, blue curacao, and lime juice with ice, strain into the salt-rimmed glass, and serve.",
                "https://www.thecocktaildb.com/images/media/drink/qtvvyq1439905913.jpg", "tequila","blue curacao","lime juice","salt",
                null,null,null,null,null,null,null,null,null,null,null,"1 1/2 oz",
                "1 oz","1 oz","coarse",null,null,null,null,null,null,null,null,null,null,null);
        favouriteCocktailList.add(favouriteCocktail1);
        favouriteCocktailList.add(favouriteCocktail2);
        return favouriteCocktailList;
    }

    @Test
    public void getAllFavouriteCocktails() {
        CocktailServiceImpl cocktailServiceImpl = mock(CocktailServiceImpl.class);
        when(cocktailServiceImpl.getAllFavouriteCocktails()).thenReturn(prepareMockData());
        Assert.assertThat(cocktailServiceImpl.getAllFavouriteCocktails(), Matchers.hasSize(2));
    }

    @Test
    public void addFavouriteCocktail() {
        CocktailServiceImpl cocktailServiceImpl = mock(CocktailServiceImpl.class);
        given(cocktailServiceImpl.addFavouriteCocktail(Mockito.any(FavouriteCocktail.class))).willReturn(true);
        Assert.assertTrue(cocktailServiceImpl.addFavouriteCocktail(new FavouriteCocktail("blue margarita", "ordinary drink","alcoholic","cocktail class","Rub rim of cocktail glass with lime juice. Dip rim in coarse salt. Shake tequila, blue curacao, and lime juice with ice, strain into the salt-rimmed glass, and serve.",
                "https://www.thecocktaildb.com/images/media/drink/qtvvyq1439905913.jpg", "tequila","blue curacao","lime juice","salt",
                null,null,null,null,null,null,null,null,null,null,null,"1 1/2 oz",
                "1 oz","1 oz","coarse",null,null,null,null,null,null,null,null,null,null,null)));
    }

    @Test
    public void deleteFavouriteCocktailById() {
        CocktailServiceImpl cocktailServiceImpl = mock(CocktailServiceImpl.class);
        given(cocktailServiceImpl.deleteFavouriteCocktailById(Mockito.any(Long.class))).willReturn(true);
        Assert.assertTrue(cocktailServiceImpl.deleteFavouriteCocktailById(1));

    }
}