public class main {

    public static void main(String[] args) {

        student obj1 = new student("meena",33333,"meena@gmail.com",761990743,21);
        student obj2 = new student("mathu",444444,"mathu@gmail.com",770981384,19);
        student obj3= new student("sinthujan",77777,"sinthu@gmail.com",770981374,19);
        student obj4 = new student("chnthira",444544,"chanthira@gmail.com",770961384,19);
        student obj5 = new student("kannan",664444,"kannan@gmail.com",770981784,16);


        System.out.println(obj1.Name);
        System.out.println(obj2.Name);
        System.out.println(obj3.Name);
        System.out.println(obj4.Name);
        System.out.println(obj5.Name);

        obj1.info();
        obj2.info();
        obj3.info();
        obj4.info();
        obj5.info();
    }
}
