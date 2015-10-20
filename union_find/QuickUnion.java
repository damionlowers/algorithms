
/**
 * Write a description of class QuickUnion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickUnion
{
    // instance variables - replace the example below with your own
    private int[] id;

    /**
     * Constructor for objects of class QuickUnion
     */
    public QuickUnion(int n)
    {
        id = new int[n];
        for(int i=0;i< n;i++) id[i] = i;
    }

    private int root(int i){
        while(i != id[i]) i =id[i];
        return i;
    }
    
    public boolean connected(int p,int q){
        return root(p) == root(q);
    }
    
    public void union(int p,int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    
    public String toString(){
        String result = "";
        String result2 = "";
        for(int i = 0;i<id.length;i++){
            result2 = result2+" " + i;
            result = result +" "+ id[i]; 
        }
        System.out.println(result2);
        return result;
    }
}
