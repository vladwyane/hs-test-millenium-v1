package blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by bigdrop on 9/17/2018.
 */
@Block(@FindBy(className = "locations-nav"))
public class LocationsNav extends HtmlElement {

    public TextInput getSearchField() {
        return searchField;
    }

    @FindBy(id = "search-locations-address")
    private TextInput searchField;

    public Button getFindStoreBut() {
        return findStoreBut;
    }

    @FindBy(xpath = "//input[@value='Find Stores']")
    private Button findStoreBut;

    public void clickFindStoreBut() {
        findStoreBut.click();
    }

}
