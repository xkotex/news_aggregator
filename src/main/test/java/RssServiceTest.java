import na.entity.Item;
import na.exception.RssException;
import na.service.RssService;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

import java.io.File;

import static org.junit.Assert.*;

public class RssServiceTest {

    private RssService rssService;

    @Before
    public void setUp() throws Exception {
        rssService = new RssService();
    }

    @Test
    public void testGetItemsFile() throws RssException {
        List<Item> itemList = rssService.getItems(new File("E:\\Spring\\news_aggregator\\src\\main\\test-rss\\test.xml"));
        assertEquals(10, itemList.size());
        Item firstItem = itemList.get(0);
        assertEquals("How to solve Source not found error during debug in Eclipse", firstItem.getTitle());
        assertEquals("22 06 2014 23:35:49", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
    }

}
