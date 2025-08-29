package pe.edu.upeu.claseinterna;

public class ClaseExterna {
int a, b;
    class ClaseInterna{
        double r;

        double sumar(){
            return a+b;
        }
    }
    class ClaseInterna2{
        double r;
        double restar(){
            return r = a-b;
        }
    }
}

class ClaseExterna2{
    public static void main(String[] args) {
        ClaseExterna ce=new ClaseExterna();
        ce.a = 10;
        ce.b = 20;
        ClaseExterna.ClaseInterna ci=ce.new ClaseInterna();
        System.out.println(ci.sumar());
        //cambio
        ClaseExterna.ClaseInterna2 ci2=ce.new ClaseInterna2();
        ci2.restar();
        System.out.println(ci2.r);
    }
}
