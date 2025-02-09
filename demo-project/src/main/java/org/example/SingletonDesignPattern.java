package org.example;

public class SingletonDesignPattern {
    private static SingletonDesignPattern pattern;

    private SingletonDesignPattern(){

    }

   public static SingletonDesignPattern getInstance(){
        if (pattern == null) {
            pattern = new SingletonDesignPattern();
        }
        return pattern;
   }

   public void log(String message){
       System.out.println("Singleton design pattern.."+ message);
   }

    public static void main(String[] args) {
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        singletonDesignPattern.log("Hello, I am using singleton..");
        SingletonDesignPattern singletonDesignPattern1 = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern.hashCode());
        System.out.println(singletonDesignPattern1.hashCode());
    }
}
