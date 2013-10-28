package eu.deustotech.internet.demo.model;

import java.util.HashMap;
import java.util.Map;

import eu.deustotech.internet.demo.R;
import eu.deustotech.internet.linkedtagworld.layout.Layout;

public class Artist implements Layout {

	@Override
	public int getLayout() {
		return R.layout.artist;
	}

	@Override
	public Map<String, Integer> getWidgets() {
		Map<String, Integer> widgetMap = new HashMap<String, Integer>();
		widgetMap.put("abstract", R.id.artist_abstract);
		widgetMap.put("name", R.id.name);
		widgetMap.put("depiction", R.id.artist_depiction);
		widgetMap.put("birthDate", R.id.birthDate);
		widgetMap.put("deathDate", R.id.deathDate);
		widgetMap.put("placeOfBirth", R.id.placeOfBirth);
		widgetMap.put("placeOfDeath", R.id.placeOfDeath);
		
		return widgetMap;
	}

}
