package eu.deustotech.internet.demo.model;

import java.util.HashMap;
import java.util.Map;

import eu.deustotech.internet.demo.R;
import eu.deustotech.internet.linkedtagworld.layout.Layout;

public class Artwork implements Layout {

	@Override
	public int getLayout() {
		return R.layout.artwork;
	}

	@Override
	public Map<String, Integer> getWidgets() {
		Map<String, Integer> widgetMap = new HashMap<String, Integer>();
		widgetMap.put("label", R.id.artwork_label);
		widgetMap.put("depiction", R.id.artwork_depiction);
		widgetMap.put("artist", R.id.artwork_artist);
		widgetMap.put("year", R.id.artwork_year);
		widgetMap.put("height", R.id.artwork_height);
		widgetMap.put("width", R.id.artwork_width);
		widgetMap.put("abstract", R.id.artwork_abstract);
		
		return widgetMap;
	}

}
