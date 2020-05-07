/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author prashant
 */
@Entity
@NamedQueries({
    @NamedQuery(name="findAll",query="select m from Movie m"),
    @NamedQuery(name="findByTitle", query="select m from Movie m where m.productTitle=:pTitle")
})
public class Movie extends Product implements Serializable{
    
    private String specialFeature;
    private int duration;
    
    public Movie() {
    }

    public Movie(String specialFeature, int duration, Long productId, String productTitle, String company, String platform, int stockNumber, String classification, String description) {
        super(productId, productTitle, company, platform, stockNumber, classification, description);
        this.specialFeature = specialFeature;
        this.duration = duration;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
      
}
