package com.depold.helpers;

import java.util.Map;
import org.junit.Test;
import static junit.framework.Assert.*;

public class MapBuilderTest {
	@Test(expected=Exception.class)
	public void testExceptionHandling() throws Exception {
		MapBuilder.build(new Object[]{"asd"});
	}
	
	@Test
	public void testEmptyResultSet() throws Exception {
		assertTrue(MapBuilder.build(new Object[]{}).isEmpty());
	}
	
	@Test
	public void testStandardResultSet() throws Exception {
		assertEquals(
			3,
			MapBuilder.build(new Object[]{
				"key1", 123,
				"key2", 234,
				"key3", 345
			}).size()
		);
	}
	
	@Test
	public void testResult() throws Exception {
		Map map = MapBuilder.build(new Object[]{
			"key1", 123,
			"key2", 345,
			"key3", 456
		});
		
		assertEquals(map.get("key1"), 123);
		assertEquals(map.get("key2"), 345);
		assertEquals(map.get("key3"), 456);
	}
}