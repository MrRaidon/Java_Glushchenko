import java.util.ArrayList;

public class Order {
    public int summa;
    public int table_number;
    public ArrayList<String> delishies;
    public String delish;
    public Boolean Free;


    Order(int _summa, int table_number, ArrayList<String> _delishies, Boolean _status) {
        this.summa = _summa;
        this.table_number = table_number;
        this.delishies = new ArrayList<>();
        for (String delishies : _delishies) {
            this.delishies.add(String.valueOf(delishies));
        }
        //this.delish = _delishies;
        this.Free = _status;
    }
}
