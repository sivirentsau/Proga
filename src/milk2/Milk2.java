
package milk2;

public class Milk2 {
    private String name;
    private int fat;
    private boolean stock;
    
    //создание конструкторов-сеттеров
    public Milk2(String n, int f, boolean s){
        this.name=n;
        this.fat=f;
        this.stock=s;     
    }
    
    public Milk2(String n, boolean s){
        this.name=n;
        this.stock=s;     
    }
    
    public Milk2(Milk2 object){
        this.name=object.name;
        this.fat=object.fat;
        this.stock=object.stock;     
    }
    
     public Milk2(){
         
     }
     
     //создание методов-геттеров
     public String Getname(){
         return name;
     }
     
     public int Getfat(){
         return fat;
     }
      
     public boolean Getstock(){
         return stock;
     }
     
     //реализация статистических методов подсчета данных (средний процент жирности и количество видов молока на складе)
      
      public static int quantity (Milk2 [] Milk2){
        int q=0;
        for (int i=0; i<4; i++)
        {
            q+=Milk2[i].fat;
        }
        return q;
    }
    
    public static int instock (Milk2 [] Milk2)
    {
        int f=0;
        for (int i=0; i<4; i++)
            if (Milk2[i].stock == true)
                f++;
        return f;
    }
    
    //метод для вывода введенной информации
    public void print(){
        System.out.println("\nНазвание молока: "+ this.Getname()+"."+"\nЖирность: "+  this.Getfat()+"%.");
        if(stock){
        System.out.println("Наличие на складе: В наличии.");       
        }
        else
        {
            System.out.println("Наличие на складе: Нет в наличии.");      
        }      
    } 
}


