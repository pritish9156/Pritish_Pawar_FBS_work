#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

//helper function
string toLower(string str)
{
    transform(str.begin(), str.end(), str.begin(), ::tolower);
    return str;
}

//base class
class Employee
{
protected:
    int id;
    string name;
    static int nextId;

public:
    Employee(string name)
    {
        this->name = name;
        id = ++nextId;
    }

    int getId()
    {
        return id;
    }

    string getName()
    {
        return name;
    }

    virtual void display() = 0;
    virtual ~Employee() {}
};//base class ends here

int Employee::nextId = 0;

//developer
class Developer : public Employee
{
    int basic, allowance;

public:
    Developer(string name, int basic, int allowance)
        : Employee(name)
    {
        this->basic = basic;
        this->allowance = allowance;
    }

    void display()
    {
        int total = basic + allowance;

        cout << "\n[Developer]";
        cout << "\nID: " << id;
        cout << "\nName: " << name;
        cout << "\nBasic Salary: " << basic;
        cout << "\nAllowance: " << allowance;
        cout << "\nTotal Salary: " << total << endl;
    }
};//developer class ends here

//manager
class Manager : public Employee
{
    int basic, bonus;

public:
    Manager(string name, int basic, int bonus)
        : Employee(name)
    {
        this->basic = basic;
        this->bonus = bonus;
    }

    void display()
    {
        int total = basic + bonus;

        cout << "\n[Manager]";
        cout << "\nID: " << id;
        cout << "\nName: " << name;
        cout << "\nBasic Salary: " << basic;
        cout << "\nBonus: " << bonus;
        cout << "\nTotal Salary: " << total << endl;
    }
};//manager class ends here

//vector
vector<Employee*> empList;

//add employee
void addEmployee()
{
    int type, basic, extra;
    string name;

    cout << "\n1. Developer\n2. Manager\nEnter choice: ";
    cin >> type;

    cin.ignore();
    cout << "Enter Name: ";
    getline(cin, name);

    cout << "Enter Basic Salary: ";
    cin >> basic;

    if(type == 1)
    {
        cout << "Enter Allowance: ";
        cin >> extra;
        empList.push_back(new Developer(name, basic, extra));
    }
    else
    {
        cout << "Enter Bonus: ";
        cin >> extra;
        empList.push_back(new Manager(name, basic, extra));
    }

    cout << "Employee added successfully. Generated ID = " << empList.back()->getId() << endl;
}

//display employee
void displayAll()
{
    for(auto e : empList)
        e->display();
}

//search employee
void searchEmployee()
{
    int choice, id;
    string name;

    cout << "\n1. Search by ID\n2. Search by Name\nEnter choice: ";
    cin >> choice;

    if(choice == 1)
    {
        cout << "Enter ID: ";
        cin >> id;

        for(auto e : empList)
        {
            if(e->getId() == id)
                e->display();
        }
    }
    else
    {
        cin.ignore();
        cout << "Enter Name: ";
        getline(cin, name);

        name = toLower(name);

        for(auto e : empList)
        {
            string temp = toLower(e->getName());

            if(temp.find(name) != string::npos)
                e->display();
        }
    }
}

//delete
void deleteEmployee()
{
    int choice, id;
    string name;

    cout << "\n1. Delete by ID\n2. Delete by Name\nEnter choice: ";
    cin >> choice;

    if(choice == 1)
    {
        cout << "Enter ID: ";
        cin >> id;

        for(int i = 0; i < empList.size(); i++)
        {
            if(empList[i]->getId() == id)
            {
                delete empList[i];
                empList.erase(empList.begin() + i);
                cout << "Deleted successfully\n";
                return;
            }
        }
    }
    else if(choice == 2)
    {
        cin.ignore();
        cout << "Enter Name: ";
        getline(cin, name);

        name = toLower(name);

        for(int i = 0; i < empList.size(); i++)
        {
            string temp = toLower(empList[i]->getName());

            if(temp.find(name) != string::npos)
            {
                delete empList[i];
                empList.erase(empList.begin() + i);
                cout << "Deleted successfully\n";
                return;
            }
        }
    }
	else
    	cout << "Record not found\n";
}

//main
int main()
{
    int choice;

    while(true)
    {
        cout << "\n\n===== EMPLOYEE MANAGEMENT SYSTEM =====";
        cout << "\n1. Add";
        cout << "\n2. Display";
        cout << "\n3. Search";
        cout << "\n4. Delete";
        cout << "\n5. Exit";
        cout << "\nEnter choice: ";
        cin >> choice;

        switch(choice)
        {
        case 1: addEmployee(); break;
        case 2: displayAll(); break;
        case 3: searchEmployee(); break;
        case 4: deleteEmployee(); break;
        case 5: exit(0);
        }
    }
}