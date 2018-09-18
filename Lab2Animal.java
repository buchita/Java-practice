package Lab2;
/*
    Purpose: Animal class to describe the animals
    Date:01/02/17
    Author Buchita Gitchamasnan

*/
public class Animal
{
    //attributes
    private String name;
    private String breed;
    private int age;
    private boolean domestic_animal;
    private String colour;


    //first constructor reads in the name
    public Animal(String name)
    {
        this.name = name;
        setName(name);
    }

    //second constructor reads in name, breed, age. domestic animal? and colour
    public Animal(String name, String breed, int age, boolean domestic_animal, String colour)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.domestic_animal = domestic_animal;
        this.colour = colour;
    }

    //setter for name
    public void setName(String name)
    {
        this.name = name;
    }
    //getter for name
    public String getName()
    {
        return this.name;
    }


    //setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //setter for age
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    //setter and getter for domestic animal
    public boolean isDomestic_animal() {
        return domestic_animal;
    }
    public void setDomestic_animal(boolean domestic_animal) {
        this.domestic_animal = domestic_animal;
    }

    //setter and getter for colour
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



    //tostring = printint out to a standard output in a nicer format.
    public String toString()
    {
        String content;
        content = "This animal is called " + this.name + " is a " + this.breed + " that is "+ this.colour + " in colour and is " + this.age + " Is it a domestic? " + "Answer: "+ this.domestic_animal;
        return content;

    }


    //make noise
   // public String

}

