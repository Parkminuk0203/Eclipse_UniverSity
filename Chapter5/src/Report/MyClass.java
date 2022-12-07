package Report;
class MyClass  { } 
class TTest {  
    MyClass doSomething() 
    {
        MyClass b = new MyClass(); //6번째 줄
        return b; 
    } 
    public static void main (String args[]) 
    { 
        TTest t = new TTest();  
        MyClass newObj = t.doSomething();  
        newObj = new MyClass(); //13번째 줄
    } 
}