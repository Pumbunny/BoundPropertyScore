/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyscore;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author GP63
 */
public class MyBean implements Serializable {
    
    public static final String PROP_SCORE_PROPERTY = "scoreProperty";
    
    private String scoreProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreProperty() {
        return scoreProperty;
    }
    
    public void setScoreProperty(String value) {
        String oldValue = this.scoreProperty;
        this.scoreProperty = value;
        propertySupport.firePropertyChange(PROP_SCORE_PROPERTY, oldValue, this.scoreProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
