// ...
using namespace std;

enum {ADD=1, MODIFY, REMOVE, LIST, EXIT};

class Person 
{
    string name;
    string phone;
    int age;

public:
    Person(string name, string phone, int age) 
        : name(name), phone(phone), age(age) {}
    // ...
};

class AddressBook 
{
    vector<Person> addressBook;

public:
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
};

int main(void)
{
    int command;
    AddressBook abook;
    do
    {
        cout << "1) add, 2) modify, 3) remove, 4) list, 5) exit > ";
        cin >> command;
        switch (command)
        {
        case ADD:
            abook.add();
            break;
        case MODIFY:
            abook.modify();
            break;
        case REMOVE:
            abook.remove();
            break;
        case LIST:
            abook.show();
            break;
        case EXIT:
            break;
        default:
            break;
        }

    } while(command != EXIT);
}
