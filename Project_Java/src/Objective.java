
import java.util.Date;

public class Objective {
    public int number;
    public Date created;
    public Date completed;
    public String header;
    public String description;
    public String event;
    public String importans;



    Objective(int _number, String _title, String _description, String _event, String _importans) {
        this.number = _number;
        this.created = new Date();
        this.completed = null;
        this.header = _title;
        this.description = _description;
        this.event = _event;
        this.importans = _importans;
    }

}