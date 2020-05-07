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
    @NamedQuery(name="findAll",query="select g from Game g"),
    @NamedQuery(name="findByTitle", query="select g from Game g where g.productTitle=:pTitle")
})

public class Game extends Product implements Serializable {
    
    private double memorySize;
    private String videoOutput;
    private int noOfPlayers;
    
     public Game() {
    }

    public Game(double memorySize, String videoOutput, int noOfPlayers, Long productId, String productTitle, String company, String platform, int stockNumber, String classification, String description) {
        super(productId, productTitle, company, platform, stockNumber, classification, description);
        this.memorySize = memorySize;
        this.videoOutput = videoOutput;
        this.noOfPlayers = noOfPlayers;
    }
    
    public String getVideoOutput() {
        return videoOutput;
    }

    public void setVideoOutput(String videoOutput) {
        this.videoOutput = videoOutput;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
    
    
    
    
    

   

    public double getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }
  

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
