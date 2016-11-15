package newteam2.welcometomoscow;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Джал on 11/6/2016.
 */

public class EventList {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("quest_id")
    @Expose
    private String quest_id;

    @SerializedName("desc")
    @Expose
    private String desc;

    @SerializedName("long_desc")
    @Expose
    private String long_desc;

    @SerializedName("icon_id")
    @Expose
    private String icon_id;

    @SerializedName("events")
    @Expose
    private ArrayList<Event> events = new ArrayList<>();

    public String getQuest_id() {
        return quest_id;
    }

    public void setQuest_id(String quest_id) {
        this.quest_id = quest_id;
    }

    public String getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(String icon_id) {
        this.icon_id = icon_id;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLong_desc() {
        return long_desc;
    }

    public void setLong_desc(String long_desc) {
        this.long_desc = long_desc;
    }
}
