package com.lzy.okgo.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: JsonParams <br>
 * Description: json参数<br>
 * Author: Cyarie <br>
 * Created: 2016/11/16 14:41 <br>
 * Update Time：<br>
 * Update Description：<br>
 */
public class JsonParams {
    protected final JSONObject params = new JSONObject();

    public void put(String key, String value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, boolean value) {
        if (key != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, Object value) {
        if (key != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, int value) {
        if (key != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, double value) {
        if (key != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, float value) {
        if (key != null) {
            try {
                this.params.put(key, (double) value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, String[] value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, new JSONArray(Arrays.asList(value)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, List value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, new JSONArray(value));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, JSONArray value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, JSONObject value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, value);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(String key, JsonParams value) {
        if (key != null && value != null) {
            try {
                this.params.put(key, value.toJson());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public JsonParams remove(String key) {
        this.params.remove(key);
        return this;
    }

    public JsonParams with(String key) {
        if (key == null) {
            return null;
        }
        JsonParams p = new JsonParams();
        p.put(key, this.params);
        return p;
    }

    public JSONObject toJson() {
        return this.params;
    }

    public String toString() {
        return this.params.toString();
    }

    public String getEncodedParamString() {
        StringBuilder result = new StringBuilder();
        Iterator it = this.params.keys();
        while (it.hasNext()) {
            if (result.length() > 0) {
                result.append("&");
            }
            String key = (String) it.next();
            String value = this.params.optString(key);
            result.append(URLEncoder.encode(key));
            result.append("=");
            result.append(URLEncoder.encode(value));
        }
        return result.toString();
    }

}
