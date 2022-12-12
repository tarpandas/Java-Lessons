class Employee{
    public static void main(String[] args) {
        // Non-static inner class
        Employee.InnerEmployeeClass1 obj1 = new Employee().new InnerEmployeeClass1();
        obj1.display("Vishal");

        // Static inner class
        Employee.InnerEmployeeClass2 obj2 = new Employee.InnerEmployeeClass2();
        obj2.display("Tarpan");

        //Annonymous class
        /*
         * It is a type of inner class which
         *  has no name
         *  can be instantiated only once
         *  is usually declared inside a method or a code block ,a curly braces ending with semicolon.
         *  is accessible only at the point where it is defined.
         *  does not have a constructor simply because it does not have a name
         *  cannot be static
         */
        InnerEmployeeClass3 obj3 = new InnerEmployeeClass3(){
            void display(String deptCode){
                System.out.println("Department: "+ deptCode);
            }
        };

        InnerEmployeeClass3 obj4 = new InnerEmployeeClass3();
        obj3.display("CSE");
        obj4.display("Dost");
    }
    class InnerEmployeeClass1{
        void display(String name){
            System.out.println("Name: "+name);
        }
    }
    static class InnerEmployeeClass2{
        void display(String name){
            System.out.println("Name: "+name);
        }
    }
}

class InnerEmployeeClass3{
    void display(String name){
        System.out.println("Name: "+name);
    }
}