package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;
import models.Woman.Event;


/**
 * The Interface Logicable.
 */
interface Logicable {
    
    /**
     * Gets the event date.
     * 
     * @param event
     *            the event
     * @return the event date
     */
    public Date getEventDate(Event event);
}