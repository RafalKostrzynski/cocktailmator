package pl.kostrzynkamien.cocktailomator.Model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idDrink",
        "strDrink",
        "strDrinkAlternate",
        "strDrinkES",
        "strDrinkDE",
        "strDrinkFR",
        "strDrinkZH-HANS",
        "strDrinkZH-HANT",
        "strTags",
        "strVideo",
        "strCategory",
        "strIBA",
        "strAlcoholic",
        "strGlass",
        "strInstructions",
        "strInstructionsES",
        "strInstructionsDE",
        "strInstructionsFR",
        "strInstructionsZH-HANS",
        "strInstructionsZH-HANT",
        "strDrinkThumb",
        "strIngredient1",
        "strIngredient2",
        "strIngredient3",
        "strIngredient4",
        "strIngredient5",
        "strIngredient6",
        "strIngredient7",
        "strIngredient8",
        "strIngredient9",
        "strIngredient10",
        "strIngredient11",
        "strIngredient12",
        "strIngredient13",
        "strIngredient14",
        "strIngredient15",
        "strMeasure1",
        "strMeasure2",
        "strMeasure3",
        "strMeasure4",
        "strMeasure5",
        "strMeasure6",
        "strMeasure7",
        "strMeasure8",
        "strMeasure9",
        "strMeasure10",
        "strMeasure11",
        "strMeasure12",
        "strMeasure13",
        "strMeasure14",
        "strMeasure15",
        "strCreativeCommonsConfirmed",
        "dateModified"
})


public class Recipe {
    @JsonProperty("idDrink")
    private String idDrink;
    @JsonProperty("strDrink")
    private String strDrink;
    @JsonProperty("strDrinkAlternate")
    private Object strDrinkAlternate;
    @JsonProperty("strDrinkES")
    private Object strDrinkES;
    @JsonProperty("strDrinkDE")
    private Object strDrinkDE;
    @JsonProperty("strDrinkFR")
    private Object strDrinkFR;
    @JsonProperty("strDrinkZH-HANS")
    private Object strDrinkZHHANS;
    @JsonProperty("strDrinkZH-HANT")
    private Object strDrinkZHHANT;
    @JsonProperty("strTags")
    private Object strTags;
    @JsonProperty("strVideo")
    private Object strVideo;
    @JsonProperty("strCategory")
    private String strCategory;
    @JsonProperty("strIBA")
    private Object strIBA;
    @JsonProperty("strAlcoholic")
    private String strAlcoholic;
    @JsonProperty("strGlass")
    private String strGlass;
    @JsonProperty("strInstructions")
    private String strInstructions;
    @JsonProperty("strInstructionsES")
    private Object strInstructionsES;
    @JsonProperty("strInstructionsDE")
    private String strInstructionsDE;
    @JsonProperty("strInstructionsFR")
    private Object strInstructionsFR;
    @JsonProperty("strInstructionsZH-HANS")
    private Object strInstructionsZHHANS;
    @JsonProperty("strInstructionsZH-HANT")
    private Object strInstructionsZHHANT;
    @JsonProperty("strDrinkThumb")
    private String strDrinkThumb;
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @JsonProperty("strIngredient5")
    private String strIngredient5;
    @JsonProperty("strIngredient6")
    private String strIngredient6;
    @JsonProperty("strIngredient7")
    private Object strIngredient7;
    @JsonProperty("strIngredient8")
    private Object strIngredient8;
    @JsonProperty("strIngredient9")
    private Object strIngredient9;
    @JsonProperty("strIngredient10")
    private Object strIngredient10;
    @JsonProperty("strIngredient11")
    private Object strIngredient11;
    @JsonProperty("strIngredient12")
    private Object strIngredient12;
    @JsonProperty("strIngredient13")
    private Object strIngredient13;
    @JsonProperty("strIngredient14")
    private Object strIngredient14;
    @JsonProperty("strIngredient15")
    private Object strIngredient15;
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @JsonProperty("strMeasure4")
    private String strMeasure4;
    @JsonProperty("strMeasure5")
    private String strMeasure5;
    @JsonProperty("strMeasure6")
    private Object strMeasure6;
    @JsonProperty("strMeasure7")
    private Object strMeasure7;
    @JsonProperty("strMeasure8")
    private Object strMeasure8;
    @JsonProperty("strMeasure9")
    private Object strMeasure9;
    @JsonProperty("strMeasure10")
    private Object strMeasure10;
    @JsonProperty("strMeasure11")
    private Object strMeasure11;
    @JsonProperty("strMeasure12")
    private Object strMeasure12;
    @JsonProperty("strMeasure13")
    private Object strMeasure13;
    @JsonProperty("strMeasure14")
    private Object strMeasure14;
    @JsonProperty("strMeasure15")
    private Object strMeasure15;
    @JsonProperty("strCreativeCommonsConfirmed")
    private String strCreativeCommonsConfirmed;
    @JsonProperty("dateModified")
    private String dateModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Recipe() {
    }

    public Recipe(String idDrink, String strDrink, Object strDrinkAlternate, Object strDrinkES, Object strDrinkDE, Object strDrinkFR, Object strDrinkZHHANS, Object strDrinkZHHANT, Object strTags, Object strVideo, String strCategory, Object strIBA, String strAlcoholic, String strGlass, String strInstructions, Object strInstructionsES, String strInstructionsDE, Object strInstructionsFR, Object strInstructionsZHHANS, Object strInstructionsZHHANT, String strDrinkThumb, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strIngredient5, String strIngredient6, Object strIngredient7, Object strIngredient8, Object strIngredient9, Object strIngredient10, Object strIngredient11, Object strIngredient12, Object strIngredient13, Object strIngredient14, Object strIngredient15, String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5, Object strMeasure6, Object strMeasure7, Object strMeasure8, Object strMeasure9, Object strMeasure10, Object strMeasure11, Object strMeasure12, Object strMeasure13, Object strMeasure14, Object strMeasure15, String dateModified) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strDrinkAlternate = strDrinkAlternate;
        this.strDrinkES = strDrinkES;
        this.strDrinkDE = strDrinkDE;
        this.strDrinkFR = strDrinkFR;
        this.strDrinkZHHANS = strDrinkZHHANS;
        this.strDrinkZHHANT = strDrinkZHHANT;
        this.strTags = strTags;
        this.strVideo = strVideo;
        this.strCategory = strCategory;
        this.strIBA = strIBA;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
        this.strInstructionsES = strInstructionsES;
        this.strInstructionsDE = strInstructionsDE;
        this.strInstructionsFR = strInstructionsFR;
        this.strInstructionsZHHANS = strInstructionsZHHANS;
        this.strInstructionsZHHANT = strInstructionsZHHANT;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strIngredient6 = strIngredient6;
        this.strIngredient7 = strIngredient7;
        this.strIngredient8 = strIngredient8;
        this.strIngredient9 = strIngredient9;
        this.strIngredient10 = strIngredient10;
        this.strIngredient11 = strIngredient11;
        this.strIngredient12 = strIngredient12;
        this.strIngredient13 = strIngredient13;
        this.strIngredient14 = strIngredient14;
        this.strIngredient15 = strIngredient15;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.strMeasure6 = strMeasure6;
        this.strMeasure7 = strMeasure7;
        this.strMeasure8 = strMeasure8;
        this.strMeasure9 = strMeasure9;
        this.strMeasure10 = strMeasure10;
        this.strMeasure11 = strMeasure11;
        this.strMeasure12 = strMeasure12;
        this.strMeasure13 = strMeasure13;
        this.strMeasure14 = strMeasure14;
        this.strMeasure15 = strMeasure15;
        this.dateModified = dateModified;
    }

    @JsonProperty("idDrink")
    public String getIdDrink() {
        return idDrink;
    }

    @JsonProperty("idDrink")
    public void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    @JsonProperty("strDrink")
    public String getStrDrink() {
        return strDrink;
    }

    @JsonProperty("strDrink")
    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    @JsonProperty("strDrinkAlternate")
    public Object getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    @JsonProperty("strDrinkAlternate")
    public void setStrDrinkAlternate(Object strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    @JsonProperty("strDrinkES")
    public Object getStrDrinkES() {
        return strDrinkES;
    }

    @JsonProperty("strDrinkES")
    public void setStrDrinkES(Object strDrinkES) {
        this.strDrinkES = strDrinkES;
    }

    @JsonProperty("strDrinkDE")
    public Object getStrDrinkDE() {
        return strDrinkDE;
    }

    @JsonProperty("strDrinkDE")
    public void setStrDrinkDE(Object strDrinkDE) {
        this.strDrinkDE = strDrinkDE;
    }

    @JsonProperty("strDrinkFR")
    public Object getStrDrinkFR() {
        return strDrinkFR;
    }

    @JsonProperty("strDrinkFR")
    public void setStrDrinkFR(Object strDrinkFR) {
        this.strDrinkFR = strDrinkFR;
    }

    @JsonProperty("strDrinkZH-HANS")
    public Object getStrDrinkZHHANS() {
        return strDrinkZHHANS;
    }

    @JsonProperty("strDrinkZH-HANS")
    public void setStrDrinkZHHANS(Object strDrinkZHHANS) {
        this.strDrinkZHHANS = strDrinkZHHANS;
    }

    @JsonProperty("strDrinkZH-HANT")
    public Object getStrDrinkZHHANT() {
        return strDrinkZHHANT;
    }

    @JsonProperty("strDrinkZH-HANT")
    public void setStrDrinkZHHANT(Object strDrinkZHHANT) {
        this.strDrinkZHHANT = strDrinkZHHANT;
    }

    @JsonProperty("strTags")
    public Object getStrTags() {
        return strTags;
    }

    @JsonProperty("strTags")
    public void setStrTags(Object strTags) {
        this.strTags = strTags;
    }

    @JsonProperty("strVideo")
    public Object getStrVideo() {
        return strVideo;
    }

    @JsonProperty("strVideo")
    public void setStrVideo(Object strVideo) {
        this.strVideo = strVideo;
    }

    @JsonProperty("strCategory")
    public String getStrCategory() {
        return strCategory;
    }

    @JsonProperty("strCategory")
    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    @JsonProperty("strIBA")
    public Object getStrIBA() {
        return strIBA;
    }

    @JsonProperty("strIBA")
    public void setStrIBA(Object strIBA) {
        this.strIBA = strIBA;
    }

    @JsonProperty("strAlcoholic")
    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    @JsonProperty("strAlcoholic")
    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    @JsonProperty("strGlass")
    public String getStrGlass() {
        return strGlass;
    }

    @JsonProperty("strGlass")
    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    @JsonProperty("strInstructions")
    public String getStrInstructions() {
        return strInstructions;
    }

    @JsonProperty("strInstructions")
    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    @JsonProperty("strInstructionsES")
    public Object getStrInstructionsES() {
        return strInstructionsES;
    }

    @JsonProperty("strInstructionsES")
    public void setStrInstructionsES(Object strInstructionsES) {
        this.strInstructionsES = strInstructionsES;
    }

    @JsonProperty("strInstructionsDE")
    public String getStrInstructionsDE() {
        return strInstructionsDE;
    }

    @JsonProperty("strInstructionsDE")
    public void setStrInstructionsDE(String strInstructionsDE) {
        this.strInstructionsDE = strInstructionsDE;
    }

    @JsonProperty("strInstructionsFR")
    public Object getStrInstructionsFR() {
        return strInstructionsFR;
    }

    @JsonProperty("strInstructionsFR")
    public void setStrInstructionsFR(Object strInstructionsFR) {
        this.strInstructionsFR = strInstructionsFR;
    }

    @JsonProperty("strInstructionsZH-HANS")
    public Object getStrInstructionsZHHANS() {
        return strInstructionsZHHANS;
    }

    @JsonProperty("strInstructionsZH-HANS")
    public void setStrInstructionsZHHANS(Object strInstructionsZHHANS) {
        this.strInstructionsZHHANS = strInstructionsZHHANS;
    }

    @JsonProperty("strInstructionsZH-HANT")
    public Object getStrInstructionsZHHANT() {
        return strInstructionsZHHANT;
    }

    @JsonProperty("strInstructionsZH-HANT")
    public void setStrInstructionsZHHANT(Object strInstructionsZHHANT) {
        this.strInstructionsZHHANT = strInstructionsZHHANT;
    }

    @JsonProperty("strDrinkThumb")
    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    @JsonProperty("strDrinkThumb")
    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    @JsonProperty("strIngredient1")
    public String getStrIngredient1() {
        return strIngredient1;
    }

    @JsonProperty("strIngredient1")
    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    @JsonProperty("strIngredient2")
    public String getStrIngredient2() {
        return strIngredient2;
    }

    @JsonProperty("strIngredient2")
    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    @JsonProperty("strIngredient3")
    public String getStrIngredient3() {
        return strIngredient3;
    }

    @JsonProperty("strIngredient3")
    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    @JsonProperty("strIngredient4")
    public String getStrIngredient4() {
        return strIngredient4;
    }

    @JsonProperty("strIngredient4")
    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    @JsonProperty("strIngredient5")
    public String getStrIngredient5() {
        return strIngredient5;
    }

    @JsonProperty("strIngredient5")
    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    @JsonProperty("strIngredient6")
    public String getStrIngredient6() {
        return strIngredient6;
    }

    @JsonProperty("strIngredient6")
    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    @JsonProperty("strIngredient7")
    public Object getStrIngredient7() {
        return strIngredient7;
    }

    @JsonProperty("strIngredient7")
    public void setStrIngredient7(Object strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    @JsonProperty("strIngredient8")
    public Object getStrIngredient8() {
        return strIngredient8;
    }

    @JsonProperty("strIngredient8")
    public void setStrIngredient8(Object strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    @JsonProperty("strIngredient9")
    public Object getStrIngredient9() {
        return strIngredient9;
    }

    @JsonProperty("strIngredient9")
    public void setStrIngredient9(Object strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    @JsonProperty("strIngredient10")
    public Object getStrIngredient10() {
        return strIngredient10;
    }

    @JsonProperty("strIngredient10")
    public void setStrIngredient10(Object strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    @JsonProperty("strIngredient11")
    public Object getStrIngredient11() {
        return strIngredient11;
    }

    @JsonProperty("strIngredient11")
    public void setStrIngredient11(Object strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    @JsonProperty("strIngredient12")
    public Object getStrIngredient12() {
        return strIngredient12;
    }

    @JsonProperty("strIngredient12")
    public void setStrIngredient12(Object strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    @JsonProperty("strIngredient13")
    public Object getStrIngredient13() {
        return strIngredient13;
    }

    @JsonProperty("strIngredient13")
    public void setStrIngredient13(Object strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    @JsonProperty("strIngredient14")
    public Object getStrIngredient14() {
        return strIngredient14;
    }

    @JsonProperty("strIngredient14")
    public void setStrIngredient14(Object strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    @JsonProperty("strIngredient15")
    public Object getStrIngredient15() {
        return strIngredient15;
    }

    @JsonProperty("strIngredient15")
    public void setStrIngredient15(Object strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    @JsonProperty("strMeasure1")
    public String getStrMeasure1() {
        return strMeasure1;
    }

    @JsonProperty("strMeasure1")
    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    @JsonProperty("strMeasure2")
    public String getStrMeasure2() {
        return strMeasure2;
    }

    @JsonProperty("strMeasure2")
    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    @JsonProperty("strMeasure3")
    public String getStrMeasure3() {
        return strMeasure3;
    }

    @JsonProperty("strMeasure3")
    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    @JsonProperty("strMeasure4")
    public String getStrMeasure4() {
        return strMeasure4;
    }

    @JsonProperty("strMeasure4")
    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    @JsonProperty("strMeasure5")
    public String getStrMeasure5() {
        return strMeasure5;
    }

    @JsonProperty("strMeasure5")
    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    @JsonProperty("strMeasure6")
    public Object getStrMeasure6() {
        return strMeasure6;
    }

    @JsonProperty("strMeasure6")
    public void setStrMeasure6(Object strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    @JsonProperty("strMeasure7")
    public Object getStrMeasure7() {
        return strMeasure7;
    }

    @JsonProperty("strMeasure7")
    public void setStrMeasure7(Object strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    @JsonProperty("strMeasure8")
    public Object getStrMeasure8() {
        return strMeasure8;
    }

    @JsonProperty("strMeasure8")
    public void setStrMeasure8(Object strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    @JsonProperty("strMeasure9")
    public Object getStrMeasure9() {
        return strMeasure9;
    }

    @JsonProperty("strMeasure9")
    public void setStrMeasure9(Object strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    @JsonProperty("strMeasure10")
    public Object getStrMeasure10() {
        return strMeasure10;
    }

    @JsonProperty("strMeasure10")
    public void setStrMeasure10(Object strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    @JsonProperty("strMeasure11")
    public Object getStrMeasure11() {
        return strMeasure11;
    }

    @JsonProperty("strMeasure11")
    public void setStrMeasure11(Object strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    @JsonProperty("strMeasure12")
    public Object getStrMeasure12() {
        return strMeasure12;
    }

    @JsonProperty("strMeasure12")
    public void setStrMeasure12(Object strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    @JsonProperty("strMeasure13")
    public Object getStrMeasure13() {
        return strMeasure13;
    }

    @JsonProperty("strMeasure13")
    public void setStrMeasure13(Object strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    @JsonProperty("strMeasure14")
    public Object getStrMeasure14() {
        return strMeasure14;
    }

    @JsonProperty("strMeasure14")
    public void setStrMeasure14(Object strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    @JsonProperty("strMeasure15")
    public Object getStrMeasure15() {
        return strMeasure15;
    }

    @JsonProperty("strMeasure15")
    public void setStrMeasure15(Object strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    @JsonProperty("strCreativeCommonsConfirmed")
    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    @JsonProperty("strCreativeCommonsConfirmed")
    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    @JsonProperty("dateModified")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("dateModified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "idDrink='" + idDrink + '\'' +
                ", strDrink='" + strDrink + '\'' +
                ", strDrinkAlternate=" + strDrinkAlternate +
                ", strDrinkES=" + strDrinkES +
                ", strDrinkDE=" + strDrinkDE +
                ", strDrinkFR=" + strDrinkFR +
                ", strDrinkZHHANS=" + strDrinkZHHANS +
                ", strDrinkZHHANT=" + strDrinkZHHANT +
                ", strTags=" + strTags +
                ", strVideo=" + strVideo +
                ", strCategory='" + strCategory + '\'' +
                ", strIBA=" + strIBA +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strInstructionsES=" + strInstructionsES +
                ", strInstructionsDE='" + strInstructionsDE + '\'' +
                ", strInstructionsFR=" + strInstructionsFR +
                ", strInstructionsZHHANS=" + strInstructionsZHHANS +
                ", strInstructionsZHHANT=" + strInstructionsZHHANT +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strIngredient6='" + strIngredient6 + '\'' +
                ", strIngredient7=" + strIngredient7 +
                ", strIngredient8=" + strIngredient8 +
                ", strIngredient9=" + strIngredient9 +
                ", strIngredient10=" + strIngredient10 +
                ", strIngredient11=" + strIngredient11 +
                ", strIngredient12=" + strIngredient12 +
                ", strIngredient13=" + strIngredient13 +
                ", strIngredient14=" + strIngredient14 +
                ", strIngredient15=" + strIngredient15 +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", strMeasure6=" + strMeasure6 +
                ", strMeasure7=" + strMeasure7 +
                ", strMeasure8=" + strMeasure8 +
                ", strMeasure9=" + strMeasure9 +
                ", strMeasure10=" + strMeasure10 +
                ", strMeasure11=" + strMeasure11 +
                ", strMeasure12=" + strMeasure12 +
                ", strMeasure13=" + strMeasure13 +
                ", strMeasure14=" + strMeasure14 +
                ", strMeasure15=" + strMeasure15 +
                ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
