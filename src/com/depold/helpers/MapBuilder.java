package com.depold.helpers;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder {
	@SuppressWarnings("unchecked")
	public static Map build(Object[] args) throws Exception {
		Map result = new HashMap();
		
		if(args.length % 2 != 0)
			throw new Exception("Number of array elements should be even!");
		
		for(int i = 0; i < args.length; i++) {
			if(i % 2 != 0) continue; // step over odd elements
			
			Object key = args[i];
			Object value = args[i+1];
			result.put(key, value);
		}
		
		return result;
	}
}