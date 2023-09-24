class defCons {
    int id;
    String name;

    defCons() {
        System.out.println(id);
        System.out.println(name);
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        defCons myObj = new defCons();
        defCons myObj1 = new defCons();

        myObj.display();
        myObj1.display();

    }
}
