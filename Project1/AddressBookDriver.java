class Person 
{
    String name;
    String phone;
    int age;

    Person(String name, String phone, int age) 
    {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    void print() 
    {
        System.out.println(this.name + "\t\t" + this.phone + "\t\t" + this.age);
    }
}

class AddressBook 
{
    ArrayList<Person> addressBook = new ArrayList<Person>();
    Scanner s = new Scanner(System.in);

    void show() 
    {
        // ...
    }

    void add() 
    {
        // ...
    }

    void modify() 
    {
        // ...
    }

    void remove() 
    {
        // ...
    }
}

class AddressBookDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AddressBook abook = new AddressBook();
        int command;
        do {
            System.out.print("1) add, 2) modify, 3) remove, 4) list, 5) exit > ");
            command = s.nextInt();
            switch (command) {
            case 1:
                abook.add();
                break;
            case 2:
                abook.modify();
                break;
            case 3:
                abook.remove();
                break;
            case 4:
                abook.show();
                break;
            case 5:
                break;
            }
        } while (command != 5);
    }
}