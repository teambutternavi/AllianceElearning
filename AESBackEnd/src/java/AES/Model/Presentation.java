package AES.Model;
// Generated May 26, 2015 3:00:19 PM by Hibernate Tools 4.3.1



/**
 * Presentation generated by hbm2java
 */
public class Presentation  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String author;
     private String filepath;
     private Integer creatorId;
     private String description;

    public Presentation() {
    }

	
    public Presentation(String description) {
        this.description = description;
    }
    public Presentation(String title, String author, String filepath, Integer creatorId, String description) {
       this.title = title;
       this.author = author;
       this.filepath = filepath;
       this.creatorId = creatorId;
       this.description = description;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getFilepath() {
        return this.filepath;
    }
    
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    public Integer getCreatorId() {
        return this.creatorId;
    }
    
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


