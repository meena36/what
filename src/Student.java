class student {

     //attribute
    String Name;
    int ID;
    String email;
    int phoneNum;
    int Age;


    //constractor

    //Syntax of constractor = className + (pass the attribute) + {this.attributeName = attributename; }

    student(String Name, int id, String email, int phoneNum, int Age) {
        this.Name = Name;
        this.ID = id;
        this.email = email;
        this.phoneNum = phoneNum;
        this.Age = Age;
    }

    //Syntax of method =return type + method Name + () + {}

        //Study
        //read
        //eat

        void study(){
            System.out.println("Student can study");
        }


        void read(){
            System.out.println("Student can read");

        }

        void eat(){
            System.out.println("Student can eat");
        }

void info(){
    System.out.println("student information");
    System.out.println("student Name " + Name);
    System.out.println("student ID " + ID);
    System.out.println("student email " + email);
    System.out.println("student phoneNum " + phoneNum);
    System.out.println("student Age " + Age);
}

    }


