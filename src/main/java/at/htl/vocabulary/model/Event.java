package at.htl.vocabulary.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

    private Long evtId;

    //eventType: Art des Events
    private EventType eventType;

    //date: Datum wo dieses Event stattfindet zur Unterscheidung
    private Date date;

    private String eventDescription;

    //words: Die Wörter des Events
    private List<Word> words = new ArrayList<>();

    public Event(EventType eventType, Date date, List<Word> words) {
        this.eventType = eventType;
        this.date = date;
        this.words = words;
    }


    //Getter und Setter


    public Long getId() {
        return evtId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}