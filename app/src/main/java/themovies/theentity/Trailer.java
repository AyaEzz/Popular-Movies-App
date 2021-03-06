package themovies.theentity;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Aya Ezz on 25/13/16.
 */
public class Trailer {
    private String id;
    private String key;
    private String name;
    private String site;
    private int size;
    private String type;

    public Trailer(JSONObject trailerObject) throws JSONException {
        this.id = trailerObject.getString("id");
        this.size = trailerObject.getInt("size");
        this.name = trailerObject.getString("name");
        this.type = trailerObject.getString("type");
        this.key = trailerObject.getString("key");
        this.site = trailerObject.getString("site");
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getSite() {
        return site;
    }

    public String getName() {
        return name;
    }

}
