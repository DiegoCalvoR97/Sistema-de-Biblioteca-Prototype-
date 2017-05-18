package Package;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Diego Calvo R
 */
public class Node {
    
    
    private Node link1, link2, link3, link4, left, right;
    private String data, namea, nameb, namep, codb;
    private boolean prst;
    private int  codp;
    SimpleDateFormat fechaDevolucion = new SimpleDateFormat("dd/MM/yyyy");
    private float deuda;
    private Date fechad;

    //Method Nodo REsto//
    //multilistAL//    
    public Node(String _namea, Node _link1, Node _link2){
        
        namea = _namea;
        link1= _link1;
        link2= _link2;
    }
    
    public Node(String _nameb, String _codb, Node _link2){
        
        nameb= _nameb;
        codb= _codb;
        link2= _link2;
    }
    
    //multilistPL//
    public Node(String _namep, int _codp, float _deuda, Node _link3, Node _link4){
        
        namep= _namep;
        codp= _codp;
        link3= _link3;
        link4= _link4;
        deuda= _deuda;
    }    

    public Node(String _nameb, String _namea, String _codb, Date _fechad, Node _link4){
        
        nameb= _nameb;
        namea= _namea;
        codb= _codb;
        fechad= _fechad;
        link4= _link4;
    }
    
    //doubleList//
    public Node(String _nameb, String _namea, String _codb, boolean _prst, int _codp, Node _right, Node _left){
        
        nameb= _nameb;
        namea= _namea;
        codb= _codb;
        prst= _prst;
        codp= _codp;
        right= _right;
        left= _left;
    }
    
    //Getters & Setters//
    public Node getLink1() {
        return link1;
    }

    public void setLink1(Node link1) {
        this.link1 = link1;
    }

    public Node getLink2() {
        return link2;
    }

    public void setLink2(Node link2) {
        this.link2 = link2;
    }

    public Node getLink3() {
        return link3;
    }

    public void setLink3(Node link3) {
        this.link3 = link3;
    }

    public Node getLink4() {
        return link4;
    }

    public void setLink4(Node link4) {
        this.link4 = link4;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNamea() {
        return namea;
    }

    public void setNamea(String namea) {
        this.namea = namea;
    }

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    public String getCodb() {
        return codb;
    }

    public void setCodb(String codb) {
        this.codb = codb;
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        this.codp = codp;
    }

    public boolean isPrst() {
        return prst;
    }

    public void setPrst(boolean prst) {
        this.prst = prst;
    }

    public Date getFechad() {
        return fechad;
    }

    public void setFechad(Date fechad) {
        this.fechad = fechad;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }
  
    
    
}
