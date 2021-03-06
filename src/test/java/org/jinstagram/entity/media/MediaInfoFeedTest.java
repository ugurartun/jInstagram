package org.jinstagram.entity.media;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.jinstagram.InstagramBase;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.users.feed.CarouselMedia;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.junit.*;

/**
 * The class <code>MediaInfoFeedTest</code> contains tests for the class <code>{@link MediaInfoFeed}</code>.
 *
 * @generatedBy CodePro at 31/01/16 15:05
 * @author SachinHandiekar
 * @version $Revision: 1.0 $
 */
public class MediaInfoFeedTest {
	/**
	 * Run the MediaFeedData getData() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testGetData_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		MediaFeedData result = fixture.getData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getImages());
		assertEquals(null, result.getTags());
		assertEquals(null, result.getUser());
		assertEquals("MediaFeedData [caption=null, comments=null, createdTime=null, id=null, imageFilter=null, images=null, likes=null, link=null, location=null, tags=null, type=null, user=null, userHasLiked=false, usersInPhoto=null]", result.toString());
		assertEquals(null, result.getLocation());
		assertEquals(null, result.getId());
		assertEquals(null, result.getType());
		assertEquals(false, result.isUserHasLiked());
		assertEquals(null, result.getVideos());
		assertEquals(null, result.getUsersInPhotoList());
		assertEquals(null, result.getImageFilter());
		assertEquals(null, result.getCreatedTime());
		assertEquals(null, result.getLikes());
		assertEquals(null, result.getCaption());
		assertEquals(null, result.getLink());
		assertEquals(null, result.getComments());
	}

	/**
	 * Run the Meta getMeta() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testGetMeta_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		Meta result = fixture.getMeta();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getErrorMessage());
		assertEquals(0, result.getCode());
		assertEquals("Meta [code=0, errorMessage=null, errorType=null]", result.toString());
		assertEquals(null, result.getErrorType());
	}

	/**
	 * Run the void setData(MediaFeedData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testSetData_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());
		MediaFeedData data = new MediaFeedData();

		fixture.setData(data);

		// add additional test code here
	}

	/**
	 * Run the void setMeta(Meta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testSetMeta_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());
		Meta meta = new Meta();

		fixture.setMeta(meta);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Test
	public void testToString_1()
		throws Exception {
		MediaInfoFeed fixture = new MediaInfoFeed();
		fixture.setMeta(new Meta());
		fixture.setData(new MediaFeedData());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("MediaInfoFeed [data=MediaFeedData [caption=null, comments=null, createdTime=null, id=null, imageFilter=null, images=null, likes=null, link=null, location=null, tags=null, type=null, user=null, userHasLiked=false, usersInPhoto=null], meta=Meta [code=0, errorMessage=null, errorType=null]]", result);
	}

	/**
	 * Test correct deserialization of {@link CarouselMedia} videos.
	 *
	 * @throws Exception if an IO error is encountered deserializing the JSON file
	 */
	@Test
    public void testMediaCarouselVideos() throws IOException {
	    final String s = toString("media-carousel-videos-1455920561485265648_25025320.json");
	    final MediaInfoFeed feed = InstagramBase.createObjectFromResponse(MediaInfoFeed.class, s);
	    final List<CarouselMedia> carousel = feed.getData().getCarouselMedia();
	    assertEquals(3, carousel.size());
	    for (CarouselMedia media : carousel) {
		    assertEquals("video", media.getType());
	    }
	}

	/**
	 * Test correct deserialization of {@link CarouselMedia} images.
	 *
	 * @throws Exception if an IO error is encountered deserializing the JSON file
	 */
	@Test
	public void testMediaCarouselImages() throws IOException {
		final String s = toString("media-carousel-images-1477919811501485796_25025320.json");
		final MediaInfoFeed feed = InstagramBase.createObjectFromResponse(MediaInfoFeed.class, s);
		final List<CarouselMedia> carousel = feed.getData().getCarouselMedia();
		assertEquals(4, carousel.size());
		for (CarouselMedia media : carousel) {
			assertEquals("image", media.getType());
		}
	}

    static String toString(final String s) throws UnsupportedEncodingException, IOException {
        Reader is = new InputStreamReader(MediaInfoFeedTest.class.getClassLoader().getResourceAsStream(s), "utf-8");
        try {
            final StringBuilder sb = new StringBuilder();
            final char cb[] = new char[1024];

            int n;
            while(-1 != (n = is.read(cb)) && sb.length() < 120000){
                if(n == -1) {
                    break;
                }
                for(int i = 0 ; i < n; i++) {
                    sb.append(cb[i]);
                }
            }
            return sb.toString();
        } finally {
            is.close();
        }
    }

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/01/16 15:05
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MediaInfoFeedTest.class);
	}
}