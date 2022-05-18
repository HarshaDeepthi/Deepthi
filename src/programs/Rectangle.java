package programs;

class Rectangle extends Shape{
     public  void Colour(){
        System.out.println("The Rectangle is:Red");
    }

        public static  void main(String[] args) {
            Rectangle rectangle=new Rectangle();
            rectangle.Colour();
            rectangle.area();
        }
    }